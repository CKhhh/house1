package com.house.Controller;

import com.google.gson.Gson;
import com.house.Bean.Employee;
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
public class EmployeeController {
    @Autowired
    EmployeeImpl employeeImpl;
    @RequestMapping("/insertEmployee.html")
    public void insertEmployee (@RequestParam(value = "empName")String empName,
                                 @RequestParam(value = "empPhone")String empPhone,
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
        if (!employeeImpl.userIsExist(uName)){
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx1");
            try {
                httpServletResponse.getWriter().write(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx2");
            int uuid = new Random().nextInt(89999999)+10000000;
            while (true){
                if (!employeeImpl.idIsExist(uuid)){
                    uuid = new Random().nextInt(89999999)+10000000;
                }else {
                    break;
                }
            }
            System.out.println(uuid);
            System.out.println(empName+"empNameempNameempNameempNameempNameempNameempName");

            Employee employee = new Employee(uuid,empName,empPhone,empPart,empJob,empArea,empEntry,empType,uName,password);
            System.out.println(employee.getEmpName()+"empNameempNameempNameempNameempNameempNameempName");

            try {
                employeeImpl.insertEmployee(employee);
                System.out.println("yes");
                httpServletResponse.getWriter().write(1);
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
                                        @RequestParam(value = "empPart") String empPart
            ,HttpServletResponse response){
        Gson gson = new Gson();
        String m = null;
        if (power==4){
          m = gson.toJson(employeeImpl.admin());
        }else if(power==3){
          m = gson.toJson(employeeImpl.master(power,empArea));
        }else if(power==2){
          m = gson.toJson(employeeImpl.pp(power,empArea,empPart));
        }
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(m);
        } catch (IOException e) {
            e.printStackTrace();
            try {
                response.getWriter().write(1);
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
                               @RequestParam (value = "empPart")String empPart,
                               @RequestParam(value = "empJob")String empJob,
                               @RequestParam(value = "empArea")String empArea,
                               @RequestParam(value = "empEntry")String empEntry,
                               @RequestParam(value = "empType")int empType,
                               @RequestParam(value = "uName")String uName,
                               @RequestParam(value = "password")String password,
                               HttpServletResponse response){
        Employee employee = new Employee(id,empName,empPhone,empPart,empJob,empArea,empEntry,empType,uName,password);
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
                                    @RequestParam(value = "empPart")String empPart
            ,HttpServletResponse response){
        List<Employee> e = employeeImpl.selectOneEmployee(empName,empArea,empPart);
        Gson gson = new Gson();
        String json = gson.toJson(e);
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
}
