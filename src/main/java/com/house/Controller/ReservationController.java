package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Repair;
import com.house.Bean.Reservation;
import com.house.Service.Reservation.ReservationImpl;
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
 * Time:2019-01-26 19:58
 */
@Controller
@RequestMapping("Deal/reservation")
public class ReservationController {
    @Autowired
    ReservationImpl reservationimpl;
    @RequestMapping("selectByStatus.html")
    public void selectByStatus(@RequestParam(value = "dealStatus")String status,
                               @RequestParam("pn") int pn,
                               HttpServletResponse response){
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<Reservation> list = reservationimpl.selectByStatus(status);
        PageInfo<Reservation> pageInfo = new PageInfo<Reservation>(list);
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
    @RequestMapping("insertReservation.html")
    @ResponseBody
    public void insertReservation(@RequestParam("reservation")String reservation,HttpServletResponse response){
//        int uuid = new Random().nextInt(89999999)+10000000;
//        while (true){
//            if (reservationimpl.selectOneReservation(uuid)!=null){
//                uuid = new Random().nextInt(89999999)+10000000;
//            }else {
//                break;
//            }
//        }
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Reservation reservation1 = gson.fromJson(reservation,Reservation.class);
//        reservation1.setId(uuid);
        reservationimpl.insertReservation(reservation1);
    }
    @RequestMapping("dealReservation.html")
    @ResponseBody
    public void updateReservation(@RequestParam(value = "id")int id,
                                  @RequestParam(value = "dealStatus")String dealStatus,
                                  @RequestParam(value = "dealTime")String dealTime,
                                  @RequestParam(value = "dealPerson")String dealPerson,
                                  @RequestParam(value = "dealNote")String dealNote){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(dealTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(id);
        Reservation reservation = new Reservation(id,null,null,null,null,null,dealStatus,dealTimer,dealPerson,dealNote);
        reservationimpl.updateReservation(reservation);
    }
    @RequestMapping("selectOneReservation.html")
    public void selectOneReservation(@RequestParam("id")int id,HttpServletResponse response){
        Reservation reservation = reservationimpl.selectOneReservation(id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(gson);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectBlurry.html")
    public void selectBlurry(@RequestParam("blurry")String blurry,
                             @RequestParam("pn")int pn,
                             HttpServletResponse response){
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<Reservation> list = reservationimpl.selectBlurry(blurry);
        PageInfo<Reservation> pageInfo = new PageInfo<Reservation>(list);
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
