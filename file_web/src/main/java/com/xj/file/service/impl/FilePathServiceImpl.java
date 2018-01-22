package com.xj.file.service.impl;

import com.xj.file.db.dao.FileHomeDao;
import com.xj.file.model.FileHome;
import com.xj.file.service.FilePathService;
import com.xj.file.utils.FileUtil01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class FilePathServiceImpl implements FilePathService {

    @Autowired
    private FileHomeDao fileHomeDao;

    @Override
    public String upload(MultipartFile multipartFile) throws Exception {

        FileHome fileHome = null;

        if (multipartFile != null && !multipartFile.isEmpty()) {
            String filename = multipartFile.getOriginalFilename(); //文件名

            byte[] fileBytes = multipartFile.getBytes();
            String base64File = FileUtil01.encodeBase64File(fileBytes); //base64加密
            byte[] base64FileBytes = base64File.getBytes();
            fileHome = new FileHome();
            fileHome.setFileName(filename);
            fileHome.setFileStream(base64FileBytes);
            fileHome.setIsValid(1);
            fileHome.setCreateDate(new Date());
            fileHome.setUpdateDate(new Date());
            if(fileBytes.toString() == base64FileBytes.toString()){
                System.err.println("============================================");
            }else {
                System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
        long saveSte = fileHomeDao.saveSte(fileHome);

        if (saveSte != 1) {
            return "!!!";
        }

        return "<a href="+"${ctx}/file_home/index"+">"+"继续上传</a>";
    }
}
