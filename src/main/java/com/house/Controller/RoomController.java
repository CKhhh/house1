package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Room;
import com.house.Service.Room.RoomImpl;
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
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Create By  Baimao
 * Time:2019-01-29 16:03
 */
@Controller
@RequestMapping("Room")
public class RoomController {
    @Autowired
    RoomImpl roomimpl;
    @RequestMapping("selectRoom.html")
    public void selectRoom(@RequestParam(value = "listingId")String listingId,@RequestParam(value = "pn")int pn,
                           HttpServletResponse response){
        int pagesize=6;
        PageHelper.startPage(pn,pagesize);
        List<Room> list = roomimpl.selectRoom(listingId);
        PageInfo<Room>pageInfo = new PageInfo<Room>(list);
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
    @RequestMapping("insertRoom.html")
    @ResponseBody
    public void insertRoom(@RequestParam("room") String room,
                           @RequestParam("tenantPic")MultipartFile[] tenantPic,
                           HttpServletRequest request){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Room room1 = gson.fromJson(room,Room.class);
        String sumUrl2 = "";
        for (MultipartFile mf : tenantPic) {
            if (!mf.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1);
                // 设置图片上传路径
                String pathdd = request.getContextPath();
                String url = request.getSession().getServletContext().getRealPath("/static/imgs/tenantImgs");
                // 以绝对路径保存重名命后的图片
                String urlAll = url + "/" + name + "." + ext;
                try {
                    mf.transferTo(new File(urlAll));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/tenantImgs"+ "/" + name + "." + ext;
                sumUrl2 += url2 + ";";
                // 把图片存储路径保存到数据库
            }
        }
        room1.setTenantPic(sumUrl2);
        roomimpl.insertRoom(room1);
    }
    @RequestMapping("updateRoom.html")
    @ResponseBody
    public void updateRoom(@RequestParam("room")String room,
                           @RequestParam("tenantPic")MultipartFile[] tenantPic,
                           HttpServletRequest request){
        System.out.println(room);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Room room1 = gson.fromJson(room,Room.class);
        System.out.println(room1.getPricing());
        String sumUrl2 = "";
        if (tenantPic.length!=0){
            for (MultipartFile mf : tenantPic) {
                if (!mf.isEmpty()) {
                    // 使用UUID给图片重命名，并去掉四个“-”
                    String name = UUID.randomUUID().toString().replaceAll("-", "");
                    // 获取文件的扩展名
                    String ext = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf(".") + 1);
                    // 设置图片上传路径
                    String pathdd = request.getContextPath();
                    String url = request.getSession().getServletContext().getRealPath("/static/imgs/tenantImgs");
                    // 以绝对路径保存重名命后的图片
                    String urlAll = url + "/" + name + "." + ext;
                    try {
                        mf.transferTo(new File(urlAll));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String url2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                            request.getContextPath()+"/static/imgs/tenantImgs"+ "/" + name + "." + ext;
                    sumUrl2 += url2 + ";";
                    // 把图片存储路径保存到数据库
                }
            }
            room1.setTenantPic(sumUrl2);
        }

        roomimpl.updateRoom(room1);
    }
    @RequestMapping("selectOne.html")
    public void selectOne(@RequestParam(value = "id")int id,
                          HttpServletResponse response){
        Room room = roomimpl.selectOne(id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(room);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectRoomForListing.html")
    public void selectStatusByListingId(@RequestParam(value = "listingId") String listingId,
                                        HttpServletResponse response){
        int i = roomimpl.selectStatusByListingId(listingId);
        Gson gson = new Gson();
        String json = gson.toJson(i);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
