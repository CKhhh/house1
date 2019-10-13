package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Repair;
import com.house.Service.Repair.RepairImpl;
import org.apache.commons.io.FilenameUtils;
import org.aspectj.internal.lang.reflect.DeclareParentsImpl;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:47
 */
@Controller
@RequestMapping("Deal/repair")
public class RepairController {
    @Autowired
    RepairImpl repairimpl;
    @RequestMapping("selectAllByStatus.html")
    public void selectAll(HttpServletResponse response,
                          @RequestParam(value = "pn")int pn,
                          @RequestParam(value = "dealStatus")String status){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=20;
        PageHelper.startPage(pn,pagesize);
        PageInfo<Repair>pageInfo = new PageInfo<Repair>(repairimpl.selectAll(status));
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("insertRepair.html")
    @ResponseBody
    public void insertRepair(@RequestParam(value = "repair")String repair,
                             @RequestParam(value = "repairPic2")MultipartFile[] repairPic,
                             HttpServletRequest request){
        System.out.println(repair);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        Repair repair1 = gson.fromJson(repair,Repair.class);
        String sumUrl2 = "";
//        int uuid = new Random().nextInt(89999999)+10000000;
//        while (true){
//            if (repairimpl.selectOneRepair(uuid)!=null){
//                uuid = new Random().nextInt(89999999)+10000000;
//            }else {
//                break;
//            }
//        }
//        repair1.setId(uuid);
        for (MultipartFile mf : repairPic) {
            if (!mf.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1);
                // 设置图片上传路径
                String pathdd = request.getContextPath();
                String url = request.getSession().getServletContext().getRealPath("/static/imgs/repairImgs");
                // 以绝对路径保存重名命后的图片
                String urlAll = url + "/" + name + "." + ext;
                try {
                    mf.transferTo(new File(urlAll));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/repairImgs"+ "/" + name + "." + ext;
                sumUrl2 += url2 + ";";
                // 把图片存储路径保存到数据库
            }
        }
        repair1.setRepairPic(sumUrl2);
        repairimpl.insertRepair(repair1);
    }
    @RequestMapping("dealRepair.html")
    public void dealRepair(@RequestParam(value = "id") int id,
                           @RequestParam(value = "status")String status,
                           @RequestParam(value = "person")String person,
                           @RequestParam(value = "note")String note,
                           @RequestParam(value = "time")String time,HttpServletResponse response){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dealTimer = null;
        try {
            dealTimer = formatter.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Repair repair = new Repair(id,null,null,null,null,null,null,null,status,person,note,dealTimer);
        repairimpl.updateRepair(repair);
    }
    @RequestMapping("selectOneRepair.html")
    public void selectOneRepair(@RequestParam(value = "id")int id,HttpServletResponse response){
        Repair repair = repairimpl.selectOneRepair(id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(repair);
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
        List<Repair> list = repairimpl.selectBlurry(blurry);
        PageInfo<Repair> pageInfo = new PageInfo<Repair>(list);
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
