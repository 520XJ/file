package com.xj.file.controller;

import com.xj.file.model.FileHome;
import com.xj.file.service.FileDetailsService;
import com.xj.file.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/file_details")
public class FileDetailsController extends BaseController{

    @Resource
    private FileDetailsService fileDetailsService;


    @RequestMapping(value = "/queryFileByParams")
    @ResponseBody
    public List<FileHome> queryFileByParams() {

        return fileDetailsService.queryFileByParams();
    }
}
