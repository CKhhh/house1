package com.house.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Listing;
import com.house.Bean.Performance;
import com.house.Service.Employee.EmployeeImpl;
import com.house.Service.Listing.ListingImpl;
import com.house.Service.Performance.PerformanceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-15 6:06
 */
@Controller
@RequestMapping("Performance")
public class PerformanceController {
    @Autowired
    PerformanceImpl performanceimpl;
    @Autowired
    ListingImpl listingimpl;
    @Autowired
    EmployeeImpl employeeimpl;
    @RequestMapping("insertPerformance.html")
    @ResponseBody
    public void insertPerformance(@RequestParam(value = "performance")String performance){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Performance performance1 = gson.fromJson(performance,Performance.class);
        performanceimpl.insertPerformance(performance1);
    }
    @RequestMapping("selectAllPerson.html")
    public void selectPerformance(@RequestParam(value = "listingId")String listingId,
                                  HttpServletResponse response){
        List<Listing> list = listingimpl.selectAllByListingId(listingId);
        String houseManage = "";
        String secretarial = "";
        String branch = "";
        String depa = "";
        for (Listing l : list){
             houseManage = houseManage + l.getHouseManage()+";";
             secretarial =  secretarial+l.getSecretarial()+";";
             branch = l.getBranch();
             depa = l.getDepartment();
        }
        List<String> m = employeeimpl.selectBossByOther(branch,null);
        String dianzhang =  "";
        for (String mm:m){
            dianzhang=dianzhang+mm+";";
        }
        List<String> n = employeeimpl.selectBossByOther(branch,depa);
        String jingli = "";
        for (String nn:n){
            jingli=jingli+nn+";";
        }
        String allData = houseManage+secretarial+dianzhang+jingli;
        Gson gson = new Gson();
        String json = gson.toJson(allData);
        System.out.println(json);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectAllByListing.html")
    public void selectAllByListing(@RequestParam(value = "listingId")String listingId,
                                   HttpServletResponse response){
        List<Performance> list = performanceimpl.selectAllByListingId(listingId);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
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
