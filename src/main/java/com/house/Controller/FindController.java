package com.house.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.house.Bean.Area;
import com.house.Bean.Branch;
import com.house.Service.Find.FindImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-01 13:05
 */
@Controller
@RequestMapping("Find")
public class FindController {
    @Autowired
    FindImpl findimpl;
    @RequestMapping("findComm.html")
    public void findComm(@RequestParam(value = "area")String area, HttpServletResponse response){
        List<String> list = findimpl.selectAllByName(area);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        response.setHeader("ContentType","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("findDepa.html")
    public void findDepa(@RequestParam(value = "branch")String branch,
                         HttpServletResponse response){
        List<Branch> list = findimpl.findBranch(branch);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        response.setHeader("ContentType","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/selectAllDistArea.html")
    public void selectAllDistArea(HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(findimpl.selectAllDistArea());
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/selectAllDistBranch.html")
    public void selectAllDistBranch(HttpServletResponse response){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        String json = gson.toJson(findimpl.selectAllDistBranch());
        response.setHeader("Content-Type","text/html,charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
