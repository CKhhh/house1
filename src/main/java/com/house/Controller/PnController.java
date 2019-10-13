package com.house.Controller;

import com.google.gson.Gson;
import com.house.Dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create By  Baimao
 * Time:2019-01-29 13:33
 */
@Controller
public class PnController {
    @Autowired
    ApplicationMapper applicationMapper;
    @Autowired
    ComplaintMapper complaintMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    FinanceMapper financeMapper;
    @Autowired
    ListingMapper listingMapper;
    @Autowired
    OnlineCommMapper onlineCommMapper;
    @Autowired
    RepairMapper repairMapper;
    @Autowired
    ReservationMapper reservationMapper;
    @RequestMapping("selectAllPn.html")
    public void   selectAllPn(@RequestParam(value = "pnMessage")String pnMessage,
                            @RequestParam(value = "status")String status,
                            HttpServletResponse response){
        int s = 0;
        switch (pnMessage){
            case "applicationPn" :s = applicationMapper.selectAllPn(); break;
            case "complaintPn" :s = complaintMapper.selectAllPn(status); break;
            case "employeePn" :
                System.out.println("xxxx");s = employeeMapper.selectAllPn();break;
            case "financePn" :s= financeMapper.selectAllPn();break;
            case "listingPn":s= listingMapper.selectAllPn();break;
            case "onlineCommPn":s= onlineCommMapper.selectAllPn(status);break;
            case "repairPn" :s= repairMapper.selectAllPn(status);break;
            case "reservationPn":s= reservationMapper.selectAllPn(status);break;
            default:        s= 0;
        }
        Gson gson = new Gson();
        String json = gson.toJson(s);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
