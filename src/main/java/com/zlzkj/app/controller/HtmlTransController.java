package com.zlzkj.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/11/26.
 */
@Controller

public class HtmlTransController {
    @RequestMapping("/*.html")
    public String trans(HttpServletRequest requset, HttpServletResponse response){
        String s = requset.getRequestURI();
        System.out.println(s);
        String part[] =  s.split("[.|/]");
        String result = part[part.length - 2];
        return "/"+IndexController.root+"/"+result;


    }
}
