package com.xj.file.controller;

import com.xj.file.service.FilePathService;
import com.xj.file.utils.BaseController;
import com.xj.file.utils.FileUtil01;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/file_path")
public class FilePathController extends BaseController{

    @Autowired
    private FilePathService filePathService;

    @PostMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) throws Exception {

        // 1. 将 请求体 request 转换成 springMVC的表单 类
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;

        // 2.springMVC 的表单类获取 上传的文件    MultipartFile 表单元素
        MultipartFile multipartFile = mr.getFile("file");

        /*// 3.解析
        if (multipartFile != null && !multipartFile.isEmpty()) {
            String fileName = multipartFile.getOriginalFilename();//文件名
            byte[] bytes = multipartFile.getBytes();  //文件 的 字节
            String base64File = FileUtil01.encodeBase64File(bytes); //base64 加密后的文件 字节
            System.out.println(base64File);

        }*/

        return filePathService.upload(multipartFile);
    }
}
