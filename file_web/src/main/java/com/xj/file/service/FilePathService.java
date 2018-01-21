package com.xj.file.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FilePathService {

    public String upload(MultipartFile multipartFile)throws Exception;

}
