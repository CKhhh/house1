package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Finance;
import com.house.Bean.OnlineComm;
import com.house.Service.Finance.FinanceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 21:14
 */
@Controller
@RequestMapping("Finance")
public class FinanceController {
    @Autowired
    FinanceImpl financeimpl;
    @RequestMapping("selectFinance.html")
    public void selectFinance(@RequestParam("branch")String branch,
                              @RequestParam("department")String department,
                              @RequestParam("startTime")String startTime,
                              @RequestParam("endTime")String endTime,
                              @RequestParam("pn") int pn,
                              HttpServletResponse response){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startTimer = null;
        Date endTimer = null;
        try {
            startTimer = formatter.parse(startTime);
            endTimer = formatter.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<Finance> list = financeimpl.selectFinance(startTimer,endTimer,branch,department);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        PageInfo<Finance> pageInfo = new PageInfo<Finance>(list);
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("insertFinance.html")
    @ResponseBody
    public void insertFinance(@RequestParam("finance")String finance,
                              HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Finance finance1 = gson.fromJson(finance,Finance.class);
        financeimpl.insertFinance(finance1);
    }
    @RequestMapping("selectAllByStatus.html")
    public void selectAllByStatus(@RequestParam("pn")int pn,
                                  @RequestParam("status")String status,
                                  @RequestParam("listingId")String listingId,
                                  @RequestParam("startTime")String startTime,
                                  @RequestParam("endTime")String endTime,
                                  HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        int pagesize=10;
        PageHelper.startPage(pn,pagesize);
        List<Finance> list = financeimpl.selectAllByStatus(status,listingId,startTime,endTime);
        PageInfo<Finance> pageInfo = new PageInfo<Finance>(list);
        String json = gson.toJson(pageInfo);
        System.out.println(json);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectPriceByListingId.html")
    public void selectPrice(@RequestParam(value = "listingId")String listingId,
                            @RequestParam(value = "status")String status,
                            @RequestParam(value = "startTime")String startTime,
                            @RequestParam(value = "endTime")String endTime,
                            HttpServletResponse response){
        List<BigDecimal> l = financeimpl.selectInByListingId(listingId,status,startTime,endTime);
        BigDecimal bigDecimal = new BigDecimal(0);
        for (BigDecimal m:l){
            bigDecimal = bigDecimal.add(m);
        }
        Gson gson = new Gson();
        String json =  gson.toJson(bigDecimal);
        System.out.println(json);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectPriceByOther.html")
    public void selectPriceByOther(@RequestParam(value = "branch")String branch,
                                   @RequestParam(value = "department")String department,
                                   @RequestParam(value = "status")String status,
                                   @RequestParam(value = "startTime")String startTime,
                                   @RequestParam(value = "endTime")String endTime,
                                   HttpServletResponse response){
        List<BigDecimal> l = financeimpl.selectInByOther(branch,department,status,startTime,endTime);
        BigDecimal bigDecimal = new BigDecimal(0);
        for (BigDecimal m:l){
            bigDecimal = bigDecimal.add(m);
        }
        Gson gson = new Gson();
        String json =  gson.toJson(bigDecimal);
        System.out.println(json);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
