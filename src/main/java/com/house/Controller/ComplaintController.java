package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Complaint;
import com.house.Bean.Employee;
import com.house.Bean.Repair;
import com.house.Dao.ComplaintMapper;
import com.house.Service.Complaint.ComplaintImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

/**
 * Create By  Baimao
 * Time:2019-01-26 12:08
 */
@Controller
@RequestMapping("Deal/Complaint")
public class ComplaintController {
    @Autowired
    ComplaintImpl complaintimpl;
    @RequestMapping("selectAllByStatus.html")
    public void selectAll(HttpServletRequest request, HttpServletResponse response,
                          @RequestParam(value = "pn")int pn,
                          @RequestParam(value = "dealStatus")String dealStatus){
//        HttpSession session= ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
//        String openId = (String) session.getAttribute("employee");
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        PageInfo<Complaint> pageInfo = new PageInfo<Complaint>(complaintimpl.selectAll(dealStatus));
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @ResponseBody
    @RequestMapping(value = "/insertComplaint.html",method = RequestMethod.POST)
    public void insertComplaint(@RequestParam(value = "complaint") String complaint){
        System.out.println(complaint);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int uuid = new Random().nextInt(89999999)+10000000;
        while (true){
            if (complaintimpl.selectOne(uuid)!=null){
                uuid = new Random().nextInt(89999999)+10000000;
            }else {
                break;
            }
        }
        Complaint complaint1 = gson.fromJson(complaint,Complaint.class);
        complaint1.setId(uuid);
        complaintimpl.insertComplaint(complaint1);
    }
    @RequestMapping("dealComplaint.html")
    public void dealComplaint(@RequestParam("complaintId")int complaintId,
                                @RequestParam("dealPerson")String dealPerson,
                              @RequestParam("dealTime")String dealTime,
                                  @RequestParam("dealStatus")String dealStatus,
                              @RequestParam("dealNote")String dealNote,HttpServletResponse response
                              ){
        System.out.println(dealTime);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(dealTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Complaint complaint = new Complaint(complaintId,null,null,null,
                null,null,dealPerson,dealStatus,dealTimer,dealNote );
        complaintimpl.updateComplaint(complaint);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(0);
        } catch (IOException e) {
            out.println("1");
            e.printStackTrace();
        }
    }
    @RequestMapping("selectOneComplaint")
    public void selectOneComplaint(@RequestParam(value = "id")int id,HttpServletResponse response){
        Complaint complaint = complaintimpl.selectOne(id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(complaint);
        response.setHeader("Content-Type","charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectBlurry.html")
    public void selectBlurry(@RequestParam(value = "blurry")String blurry,
                             @RequestParam(value = "pn")int pn,
                             HttpServletResponse response){
        if (blurry!=null){
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

            int pagesize=20;
            PageHelper.startPage(pn,pagesize);
            List<Complaint> list = complaintimpl.selectBlurry(blurry);
            PageInfo<Complaint>pageInfo = new PageInfo<Complaint>(list);
            String json = gson.toJson(pageInfo);
            response.setHeader("Content-Type","text/html,charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            try {
                response.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                response.getWriter().write("isnull");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
