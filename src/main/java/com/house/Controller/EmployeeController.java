package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Employee;
import com.house.Bean.Repair;
import com.house.Bean.Reservation;
import com.house.Service.Employee.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Create By Baimao
 * Time:2019-01-21 16:56
 */
@Controller
@RequestMapping("/Employee")
public class    EmployeeController {
    @Autowired
    EmployeeImpl employeeImpl;
    @RequestMapping("/insertEmployee.html")
    public void insertEmployee (@RequestParam(value = "empName")String empName,
                                 @RequestParam(value = "empPhone")String empPhone,
                                @RequestParam(value = "empBranch")String empBranch,
                                @RequestParam (value = "empPart")String empPart,
                                 @RequestParam(value = "empJob")String empJob,
                                @RequestParam(value = "empArea")String empArea,
                                @RequestParam(value = "empEntry")String empEntry,
                                @RequestParam(value = "empType")int empType,
                                @RequestParam(value = "uName")String uName,
                                @RequestParam(value = "password")String password,
                                HttpServletResponse httpServletResponse
                                ){
        httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
        httpServletResponse.setCharacterEncoding("UTF-8");
        Gson gson = new Gson();
        String json = gson.toJson(0);
        if (!employeeImpl.userIsExist(uName)){
            try {
                httpServletResponse.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            int uuid = new Random().nextInt(89999999)+10000000;
            while (true){
                if (!employeeImpl.idIsExist(uuid)){
                    uuid = new Random().nextInt(89999999)+10000000;
                }else {
                    break;
                }
            }
            Employee employee = new Employee(uuid,empName,empPhone,empBranch,empPart,empJob,empArea,empEntry,empType,uName,password);
            try {
                employeeImpl.insertEmployee(employee);
                System.out.println("yes");
                httpServletResponse.getWriter().write("{uuid:"+uuid+"}");
            }catch (Exception e){
                try {
                    httpServletResponse.getWriter().write(0);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
    @RequestMapping("selectEmployee.html")
    public void selectEmployee(@RequestParam(value = "empType") int power,
                                         @RequestParam(value="empArea") String empArea,
                                        @RequestParam(value = "empPart") String empPart,
            @RequestParam(value = "pn") int pn
            ,HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        String m = null;
        if (power==4){
            PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeImpl.admin());
          m = gson.toJson(pageInfo);
        }else if(power==3){
            PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeImpl.master(power,empArea));
            m = gson.toJson(pageInfo);
        }else if(power==2){
            PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeImpl.pp(power,empArea,empPart));
            m = gson.toJson(pageInfo);
        }
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(m);
        } catch (IOException e) {
            e.printStackTrace();
            try {
                response.getWriter().write(0);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    @RequestMapping("updateEmployee.html")
    public void updateEmployee(
                                @RequestParam(value = "empId")int id,
                                @RequestParam(value = "empName")String empName,
                               @RequestParam(value = "empPhone")String empPhone,
                                @RequestParam(value = "empBranch")String empBranch,
                                @RequestParam (value = "empPart")String empPart,
                               @RequestParam(value = "empJob")String empJob,
                               @RequestParam(value = "empArea")String empArea,
                               @RequestParam(value = "empEntry")String empEntry,
                               @RequestParam(value = "empType")int empType,
                               @RequestParam(value = "uName")String uName,
                               @RequestParam(value = "password")String password,
                               HttpServletResponse response){
        Employee employee = new Employee(id,empName,empPhone,empBranch,empPart,empJob,empArea,empEntry,empType,uName,password);
        employeeImpl.updateEmployee(employee);
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("deleteEmployee.html")
    public void deleteEmployee(@RequestParam(value = "empId") int id,HttpServletResponse response){
        employeeImpl.deleteEmployee(id);
    }
    @RequestMapping("selectOneEmployee.html")
    public void selectOneEmployee(@RequestParam(value = "empName")String empName,
                                    @RequestParam(value ="empArea") String empArea,
                                    @RequestParam(value = "empPart")String empPart,
                                    @RequestParam(value = "empType")String empType,
                                    @RequestParam(value = "pn") int pn
            ,HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<Employee> e = employeeImpl.selectOneEmployee(empName,empArea,empPart,empType);
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(e);
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e1) {
            e1.printStackTrace();
            try {
                response.getWriter().write("error");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
    @RequestMapping("uNameIsExist.html")
    public void uNameIsExist(@RequestParam(value = "uName")String uName,HttpServletResponse response){

    }
    @RequestMapping("toEmployee.html")
    public String toEmployee(){
        return "index";
    }
    @RequestMapping("selectHouseManager.html")
    public void selectHouseManager(@RequestParam(value = "branch")String branch,
                                   @RequestParam(value = "department")String depa,
                                   HttpServletResponse response){
        List<String> list = employeeImpl.selectHouseManager(branch,depa);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectSe.html")
    public void selectSe(@RequestParam(value = "branch")String branch,
                         @RequestParam(value = "department")String depa,
                         HttpServletResponse response){
        List<String> list = employeeImpl.selectSe(branch,depa);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
