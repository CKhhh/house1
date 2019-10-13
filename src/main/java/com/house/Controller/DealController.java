package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Deal;
import com.house.Bean.Repair;
import com.house.Service.deal.DealImpl;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-11 17:00
 */
@Controller
@RequestMapping ("Deal")
public class DealController {
    @Autowired
    DealImpl dealimpl;
    @RequestMapping("/updateDeal.html")
    @ResponseBody
    public void updateDeal(@RequestParam(value = "deal") String deal,
                           @RequestParam(value = "timer")String timer){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        System.out.println(deal);
        Deal deal1 = gson.fromJson(deal,Deal.class);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        try {
            deal1.setTime(df.parse(timer));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dealimpl.updateDeal(deal1);
    }
    @RequestMapping("/selectAllByStatus.html")
    public void selectAll(@RequestParam(value = "pn")int pn,
                          @RequestParam(value = "status")String status,
                          HttpServletResponse response){
        int pagesize=8;
        PageHelper.startPage(pn,pagesize);
        List<Deal> list = dealimpl.selectAll(status);
        PageInfo<Deal> pageInfo = new PageInfo<Deal>(list);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectBlurry.html")
    public void selectBlurry(@RequestParam(value = "pn")int pn,
                             @RequestParam(value = "blurry")String blurry,
                             HttpServletResponse response){
        int pagesize=8;
        PageHelper.startPage(pn,pagesize);
        List<Deal> list = dealimpl.selectBlurry(blurry);
        PageInfo<Deal> pageInfo = new PageInfo<Deal>(list);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
