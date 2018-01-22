package com.xj.file.controller;

import com.xj.file.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/file_home")
public class IndexController extends BaseController{

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request) {
        String contextPath = request.getContextPath();
        System.err.println(contextPath);
        return "file";
    }

    @RequestMapping(value = "file")
    public String file(){
        return "file01";
    }


}
