package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.OnlineComm;
import com.house.Bean.Repair;
import com.house.Service.OnlineComm.OnlineCommImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:16
 */
@Controller
@RequestMapping("Deal/onlineComm")
public class OnlineCommController {
    @Autowired
    OnlineCommImpl onlineCommimpl;
    @RequestMapping("selectAllByStatus.html")
    public void selectAll(@RequestParam(value = "dealStatus")String dealStatus,
                          @RequestParam(value = "pn") int pn,
                          HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        PageInfo<OnlineComm> pageInfo = new PageInfo<OnlineComm>(onlineCommimpl.selectAll(dealStatus));
        String json = gson.toJson(pageInfo);

        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("insertOnlineComm.html")
    @ResponseBody
    public void insertOnlineComm(@RequestParam("onlineComm")String onlineComm){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
//        int uuid = new Random().nextInt(89999999)+10000000;
//        while (true){
//            if (onlineCommimpl.selectOneOnlineComm(uuid)!=null){
//                uuid = new Random().nextInt(89999999)+10000000;
//            }else {
//                break;
//            }
//        }
        OnlineComm onlineComm1 = gson.fromJson(onlineComm,OnlineComm.class);
//        onlineComm1.setId(uuid);
        onlineCommimpl.insertOnlineComm(onlineComm1);
    }
    @RequestMapping("dealOnlineComm.html")
    public void dealOnlineComm(
                                @RequestParam("id")int id,
                                @RequestParam("dealPerson")String dealPerson,
                               @RequestParam("dealStatus")String dealStatus,
                               @RequestParam("dealTime")String dealTime,
                               @RequestParam("dealNote")String dealNote,
                               HttpServletResponse response){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(dealTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        OnlineComm onlineComm = new OnlineComm(id,null,null,null,null,null,null,dealPerson,dealStatus,dealTimer,dealNote);
        onlineCommimpl.updateOnlineComm(onlineComm);
    }
    @RequestMapping("selectOneOnlineComm.html")
    public void selectOneOnlineComm(@RequestParam(value = "id") int id,
                                    HttpServletResponse response){
        OnlineComm onlineComm = onlineCommimpl.selectOneOnlineComm(id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(onlineComm);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectBlurry.html")
    public void selectBlurry(@RequestParam(value = "blurry")String blurry,
                             @RequestParam(value = "pn") int pn,
                             HttpServletResponse response){
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<OnlineComm> list = onlineCommimpl.selectBlurry(blurry);
        PageInfo<OnlineComm> pageInfo = new PageInfo<OnlineComm>(list);
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
