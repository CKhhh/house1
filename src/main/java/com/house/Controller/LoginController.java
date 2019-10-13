package com.house.Controller;

import com.house.Bean.Employee;
import com.house.Dao.EmployeeMapper;
import com.house.Service.Employee.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Create By  Baimao
 * Time:2019-01-22 12:10
 */
@RequestMapping("/Login")
@Controller
public class LoginController {
    @Autowired
    EmployeeImpl employeeImpl;
    @RequestMapping("/login.html")
    public void checkLogin(@RequestParam(value = "uName")String uName,
                            @RequestParam(value = "password")String password,
                           HttpServletRequest request,
                           HttpServletResponse response
                           ){
        if (password.equals(employeeImpl.checkLogin(uName))){
            System.out.println(uName);
            try {
                response.getWriter().write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
            Employee employee = new Employee();
            employee = employeeImpl.selectByUname(uName);
            request.getSession().setAttribute("employee",employee);
        }else{
            try {
                response.getWriter().write("1");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @RequestMapping("toLogin.html")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("outLogin.html")
    public String outLogin(HttpSession session){
        session.invalidate();
        return "login";
    }
}

