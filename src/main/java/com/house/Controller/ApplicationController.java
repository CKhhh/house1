package com.house.Controller;

import com.google.gson.Gson;
import com.house.Bean.Application;
import com.house.Service.Application.ApplicationImpl;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        String sumUrl = null;
        String sumUrl2 = null;
        for (MultipartFile mf : applicationPic) {
            if (!mf.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext = FilenameUtils.getExtension(mf
                        .getOriginalFilename());
                // 设置图片上传路径
                String pathdd = request.getContextPath();
                String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + pathdd + "/static/imgs/applicationImgs";
                // 以绝对路径保存重名命后的图片
                String urlAll = url + "/" + name + "." + ext;
                System.out.println(urlAll);
                try {
                    mf.transferTo(new File(urlAll));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sumUrl += urlAll + ";";
                // 把图片存储路径保存到数据库
            }
        }
        BigDecimal b = new BigDecimal(applicationPrice);
        java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
        Date applicationTimer = null;
        try {
            applicationTimer = formatter.parse(applicationTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Application application = new Application(uuid, applicationTimer, applicationPerson, applicationBranch, applicationDepa, applicationJob,
                applicationPro, b, applicationBankCard, applicationReason, sumUrl, applicationStatus,
                null, null, sumUrl2, null, Integer.parseInt(applicationPersonId));
        applicationimpl.insertApplication(application);
    }

    @RequestMapping("selectOwnApplication.html")
    public void selectOwnApplication(@RequestParam(value = "personId") int personId, HttpServletResponse response) {
        Application application = applicationimpl.selectOwnApplication(personId);
        Gson gson = new Gson();
        String json = gson.toJson(application);
        response.setHeader("Content-Type", "text/html.charset=utf-8");
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
                         HttpServletResponse response
    ) {
        Gson gson = new Gson();
        String json = null;
        response.setHeader("Content-Type", "text/html,charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (power == 4) {
            json = gson.toJson(applicationimpl.adminApplication("1"));
        } else if (power == 3) {
            json = gson.toJson(applicationimpl.masterApplication("1", personArea));
        } else if (power == 2) {
            json = gson.toJson(applicationimpl.managerApplication("1", personArea, personPart));
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
                         HttpServletResponse response
    ) {
        Gson gson = new Gson();
        String json = null;
        response.setHeader("Content-Type", "text/html,charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (power == 4) {
            json = gson.toJson(applicationimpl.adminApplication("2")) + gson.toJson(applicationimpl.adminApplication("3"));
        } else if (power == 3) {
            json = gson.toJson(applicationimpl.masterApplication("2", personArea)) + gson.toJson(applicationimpl.masterApplication("3", personArea));
        } else if (power == 2) {
            json = gson.toJson(applicationimpl.managerApplication("2", personArea, personPart)) + gson.toJson(applicationimpl.managerApplication("3", personArea, personPart));
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
        String sumUrl2 = null;
        for (MultipartFile mf2 : dealPic) {
            if (!mf2.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name2 = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext2 = FilenameUtils.getExtension(mf2
                        .getOriginalFilename());
                // 设置图片上传路径
                String pathdd2 = request.getContextPath();
                String url2 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + pathdd2 + "/static/imgs/applicationImgs";
                // 以绝对路径保存重名命后的图片
                String urlAll2 = url2 + "/" + name2 + "." + ext2;
                System.out.println(urlAll2);
                try {
                    mf2.transferTo(new File(urlAll2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sumUrl2 += urlAll2 + ";";
                // 把图片存储路径保存到数据库
            }
        }
        java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(dealTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Application application = new Application(applicationId, null, null, null,
                null, null, null, null, null,
                null, null, null, dealPerson, dealTimer, sumUrl2, dealNote, applicationPersonId);
    }
}
