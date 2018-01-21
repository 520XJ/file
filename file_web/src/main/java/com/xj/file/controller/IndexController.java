package com.xj.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/file_home")
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(){
        return "file";
    }


}
