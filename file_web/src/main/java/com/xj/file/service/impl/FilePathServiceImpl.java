package com.xj.file.service.impl;

import com.xj.file.db.dao.FileHomeDao;
import com.xj.file.model.FileHome;
import com.xj.file.service.FilePathService;
import com.xj.file.utils.FileUtil01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
            String base64File = FileUtil01.encodeBase64File(fileBytes);
            fileHome = new FileHome();
            fileHome.setFileName(filename);
            fileHome.setFileStream(base64File);

        }
        int saveSte = fileHomeDao.saveSte(fileHome);

        if (saveSte != 1) {
            return "!!!";
        }

        return "ok";
    }
}
