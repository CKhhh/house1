package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Application;
import com.house.Bean.Repair;
import com.house.Service.Application.ApplicationImpl;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Create By  Baimao
 * Time:2019-01-23 12:05
 */
@Controller
@RequestMapping("Application")
public class ApplicationController {
    @Autowired
    ApplicationImpl applicationimpl;

    @RequestMapping("/insertApplication.html")
    public void insertApplication(@RequestParam(value = "applicationTime") String applicationTime,
                                  @RequestParam(value = "applicationPerson") String applicationPerson,
                                  @RequestParam(value = "applicationBranch") String applicationBranch,
                                  @RequestParam(value = "applicationDepa") String applicationDepa,
                                  @RequestParam(value = "applicationJob") String applicationJob,
                                  @RequestParam(value = "applicationPro") String applicationPro,
                                  @RequestParam(value = "applicationPrice") String applicationPrice,
                                  @RequestParam(value = "applicationBankCard") String applicationBankCard,
                                  @RequestParam(value = "applicationReason") String applicationReason,
                                  @RequestParam(value = "applicationPic", required = false) MultipartFile[] applicationPic,
                                  @RequestParam(value = "applicationStatus") String applicationStatus,
                                  @RequestParam(value = "applicationPersonId") String applicationPersonId,
                                  HttpServletResponse response, HttpServletRequest request) {
        int uuid = new Random().nextInt(89999999) + 10000000;
        while (true) {
            if (!applicationimpl.idIsExist(uuid)) {
                uuid = new Random().nextInt(89999999) + 10000000;
            } else {
                break;
            }
        }
        String sumUrl = "";
        String sumUrl2 = "";
        System.out.println("衬衫的价格："+applicationPic.length);
        for (MultipartFile mf : applicationPic) {
            if (!mf.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1);
                // 设置图片上传路径
                String pathdd = request.getContextPath();
                String url = request.getSession().getServletContext().getRealPath("/static/imgs/applicationImgs");
                // 以绝对路径保存重名命后的图片
                String urlAll = url + "/" + name + "." + ext;
                try {
                    mf.transferTo(new File(urlAll));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/applicationImgs"+ "/" + name + "." + ext;
                sumUrl += url2 + ";";
                // 把图片存储路径保存到数据库
            }
        }
        BigDecimal b = new BigDecimal(applicationPrice);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date applicationTimer = null;
        try {
            applicationTimer = formatter.parse(applicationTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(applicationTimer);
        System.out.println(sumUrl);
        Application application = new Application(uuid, applicationTimer, applicationPerson, applicationBranch, applicationDepa, applicationJob,
                applicationPro, b, applicationBankCard, applicationReason, sumUrl, applicationStatus,
                null, null, sumUrl2, null, Integer.parseInt(applicationPersonId));
        System.out.println("xxxxxxxxxxxxxxxxxx"+Integer.parseInt(applicationPersonId));
        applicationimpl.insertApplication(application);
    }

    @RequestMapping("selectOwnApplication.html")
    @ResponseBody
    public void selectOwnApplication(@RequestParam(value = "personId") int personId,
                                     @RequestParam(value = "pn") int pn,
                                     HttpServletResponse response) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        List<Application> application = applicationimpl.selectOwnApplication(personId);
        PageInfo<Application> pageInfo = new PageInfo<Application>(application);
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type", "text/htm,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("waitDeal.html")
    public void waitDeal(@RequestParam(value = "power") int power,
                         @RequestParam(value = "personId") String personId,
                         @RequestParam(value = "personArea") String personArea,
                         @RequestParam(value = "personPart") String personPart,
                         @RequestParam(value = "pn") int pn,
                         HttpServletResponse response
    ) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        String json = null;
        response.setHeader("Content-Type", "text/html,charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (power == 4) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.adminApplication("1"));
            json = gson.toJson(pageInfo);
        } else if (power == 3) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.masterApplication("1", personArea));

            json = gson.toJson(pageInfo);
        } else if (power == 2) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.managerApplication("1", personArea, personPart));

            json = gson.toJson(pageInfo);
        } else {
            json = "您没有权限";
        }
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("haveDeal.html")
    public void havedeal(@RequestParam(value = "power") int power,
                         @RequestParam(value = "personId") String personId,
                         @RequestParam(value = "personArea") String personArea,
                         @RequestParam(value = "personPart") String personPart,
                         @RequestParam(value = "pn") int pn,
                         HttpServletResponse response
    ) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        String json = null;
        response.setHeader("Content-Type", "text/html,charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (power == 4) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.adminApplication("2"));
            json = gson.toJson(pageInfo) ;
        } else if (power == 3) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.masterApplication("2", personArea));

            json = gson.toJson(pageInfo);
        } else if (power == 2) {
            PageInfo<Application> pageInfo = new PageInfo<Application>(applicationimpl.managerApplication("2", personArea, personPart));
            json = gson.toJson(pageInfo);
        } else {
            json = "您没有权限";
        }
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("dealApplication.html")
    public void dealApplication(@RequestParam(value = "applicationId") int applicationId,
                                @RequestParam(value = "applicationStatus") String applicationstatus,
                                @RequestParam(value = "dealPerson") String dealPerson,
                                @RequestParam(value = "dealTime") String dealTime,
                                @RequestParam(value = "dealPic") MultipartFile[] dealPic,
                                @RequestParam(value = "dealNote") String dealNote,
                                @RequestParam(value = "applicationPersonId") int applicationPersonId,
                                HttpServletResponse response, HttpServletRequest request) {
        String sumUrl2 = "";
        if (dealPic!=null){
        for (MultipartFile mf : dealPic) {
            if (!mf.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1);
                // 设置图片上传路径
                String pathdd = request.getContextPath();
                String url = request.getSession().getServletContext().getRealPath("/static/imgs/applicationImgs");
                // 以绝对路径保存重名命后的图片
                String urlAll = url + "/" + name + "." + ext;
                try {
                    mf.transferTo(new File(urlAll));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/applicationImgs"+ "/" + name + "." + ext;
                sumUrl2 += url2 + ";";
                // 把图片存储路径保存到数据库
            }
        }}else {
            sumUrl2=null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(dealTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Application application = new Application(applicationId, null, null, null,
                null, null, null, null, null,
                null, null, applicationstatus, dealPerson, dealTimer, sumUrl2, dealNote, applicationPersonId);
        applicationimpl.dealApplication(application);
    }
    @RequestMapping("selectBlurry")
    public void selectBlurry(@RequestParam("blurry")String blurry,
                             @RequestParam("pn") int pn, HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        PageInfo<Application>pageInfo = new PageInfo<Application>(applicationimpl.selectBlurry(blurry));
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
