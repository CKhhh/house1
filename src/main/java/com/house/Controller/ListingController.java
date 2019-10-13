package com.house.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Listing;
import com.house.Bean.Repair;
import com.house.Service.Listing.ListingImpl;
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
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Create By  Baimao
 * Time:2019-01-27 15:35
 */
@Controller
@RequestMapping("Listing")
public class ListingController {
    @Autowired
    ListingImpl listingimpl;
    @RequestMapping("selectAll.html")
    public void selectAll(HttpServletResponse response,
                          @RequestParam(value = "pn") int pn
    ){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=10;
        PageHelper.startPage(pn,pagesize);
        List<Listing> list = listingimpl.selectAll();
        PageInfo<Listing> pageInfo =
                new PageInfo<Listing>(list);
        String json = gson.toJson(pageInfo);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("selectAllByStatement.html")
    public void selectAllByStatement(@RequestParam(value = "branch")String branch,
                                     @RequestParam(value = "department")String department,
                                     @RequestParam(value = "area")String area,
                                     @RequestParam(value = "community")String community,
                                     @RequestParam("borrowType")String borrowType,
                                     @RequestParam(value = "houseType")String houseType,
                                     @RequestParam(value = "pn") int pn,
                                     @RequestParam(value = "listingStatus")String listingStatus,
                                     HttpServletResponse response
    ){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        int pagesize=10;
        PageHelper.startPage(pn,pagesize);
        PageInfo<Listing> pageInfo =
                new PageInfo<Listing>(listingimpl.selectAllByStatement(2,branch,department,area,community,borrowType,houseType,listingStatus));
        String json = gson.toJson(pageInfo);
        response.setHeader("ContentType","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("insertListing.html")
    @ResponseBody
    public void insertListing(@RequestParam(value = "listing")String listing,
                              @RequestParam(value = "listingPic")MultipartFile[] listingPic,
                              @RequestParam(value = "ownerPic")MultipartFile[] ownerPic,
                              HttpServletRequest request,
                              HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Listing listing1 = gson.fromJson(listing,Listing.class);
        String sumUrl1 = "";
        String sumUrl2 = "";
        for (MultipartFile mf1 : listingPic) {
            if (!mf1.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name1 = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext1 = FilenameUtils.getExtension(mf1
                        .getOriginalFilename());
                // 设置图片上传路径
                String pathdd1 = request.getContextPath();
                String url1 = request.getSession().getServletContext().getRealPath("/static/imgs/listingImgs");

                // 以绝对路径保存重名命后的图片
                String urlAll1 = url1 + "/" + name1 + "." + ext1;
                System.out.println(urlAll1);
                try {
                    mf1.transferTo(new File(urlAll1));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url11 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/listingImgs"+ "/" + name1 + "." + ext1;
                sumUrl1 += url11 + ";";
                // 把图片存储路径保存到数据库
            }
        }
        for (MultipartFile mf2 : ownerPic) {
            if (!mf2.isEmpty()) {
                // 使用UUID给图片重命名，并去掉四个“-”
                String name2 = UUID.randomUUID().toString().replaceAll("-", "");
                // 获取文件的扩展名
                String ext2 = FilenameUtils.getExtension(mf2
                        .getOriginalFilename());
                // 设置图片上传路径
                String pathdd2 = request.getContextPath();
                String url2 = request.getSession().getServletContext().getRealPath("/static/imgs/ownImgs");

                // 以绝对路径保存重名命后的图片
                String urlAll2 = url2 + "/" + name2 + "." + ext2;
                System.out.println(urlAll2);
                try {
                    mf2.transferTo(new File(urlAll2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String url22 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                        request.getContextPath()+"/static/imgs/ownImgs"+ "/" + name2 + "." + ext2;
                sumUrl2 += url22 + ";";                // 把图片存储路径保存到数据库
            }
        }
        listing1.setOwnerPic(sumUrl2);
        listing1.setListingPic(sumUrl1);
        listingimpl.insertListing(listing1);
    }
    @RequestMapping("selectBlurry.html")
    public void selectBlurry(@RequestParam(value = "blurry")String blurry,
                             @RequestParam(value = "pn")int pn,
                             HttpServletResponse response){
        int pagesize=10;
        PageHelper.startPage(pn,pagesize);
       ;
        List<Listing> list  = listingimpl.selectBlurry(blurry);
        PageInfo<Listing> pageInfo =
                new PageInfo<Listing>(list);
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
    @RequestMapping("selectOne.html")
    public void selectOne(@RequestParam(value = "listingId")int listingId,
                          HttpServletResponse response){
        Listing listing = listingimpl.selectOne(listingId);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        String json = gson.toJson(listing);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("updateListing.html")
    @ResponseBody
    public void updateListing(@RequestParam(value = "listing") String listing,
                              @RequestParam(value = "listingPic")MultipartFile [] listingPic,
                              @RequestParam(value = "ownerPic")MultipartFile [] ownerPic,
                              HttpServletRequest request){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Listing l = gson.fromJson(listing,Listing.class);
        if (listingPic.length!=0){
            String sumUrl1 = "";
            for (MultipartFile mf1 : listingPic) {
                if (!mf1.isEmpty()) {
                    // 使用UUID给图片重命名，并去掉四个“-”
                    String name1 = UUID.randomUUID().toString().replaceAll("-", "");
                    // 获取文件的扩展名
                    String ext1 = FilenameUtils.getExtension(mf1
                            .getOriginalFilename());
                    // 设置图片上传路径
                    String pathdd1 = request.getContextPath();
                    String url1 = request.getSession().getServletContext().getRealPath("/static/imgs/listingImgs");

                    // 以绝对路径保存重名命后的图片
                    String urlAll1 = url1 + "/" + name1 + "." + ext1;
                    String url11 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                            request.getContextPath()+"/static/imgs/listingImgs"+ "/" + name1 + "." + ext1;
                    System.out.println(url11);
                    try {
                        mf1.transferTo(new File(urlAll1));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    sumUrl1 += url11 + ";";
                    // 把图片存储路径保存到数据库
                }
            }
            l.setListingPic(sumUrl1);
        }
       if (ownerPic.length!=0){
           String sumUrl2 = "";
           for (MultipartFile mf2 : ownerPic) {
               if (!mf2.isEmpty()) {
                   // 使用UUID给图片重命名，并去掉四个“-”
                   String name2 = UUID.randomUUID().toString().replaceAll("-", "");
                   // 获取文件的扩展名
                   String ext2 = FilenameUtils.getExtension(mf2
                           .getOriginalFilename());
                   // 设置图片上传路径
                   String pathdd2 = request.getContextPath();
                   String url2 = request.getSession().getServletContext().getRealPath("/static/imgs/ownImgs");

                   // 以绝对路径保存重名命后的图片
                   String urlAll2 = url2 + "/" + name2 + "." + ext2;
                   System.out.println(urlAll2);
                   try {
                       mf2.transferTo(new File(urlAll2));
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   String url22 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
                           request.getContextPath()+"/static/imgs/ownImgs"+ "/" + name2 + "." + ext2;
                   sumUrl2 += url22 + ";";
                   // 把图片存储路径保存到数据库
               }
           }
           l.setOwnerPic(sumUrl2);
       }

        listingimpl.updateListing(l);
    }
    @RequestMapping("selectAllListingIdByOther.html")
    public void selectAllListingIdByOther(@RequestParam(value = "branch")String branch,
                                          @RequestParam(value = "department")String department,
                                          HttpServletResponse response){
        List<String> l = listingimpl.selectListingIdByOther(branch,department);
        Gson gson = new Gson();
        String json = gson.toJson(l);
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("updateListingStatus.html")
    public void updateListingStatus(@RequestParam(value = "status")String status,
                                    @RequestParam(value = "id")int id){
          listingimpl.updateListingStatus(status,id);
    }
}
