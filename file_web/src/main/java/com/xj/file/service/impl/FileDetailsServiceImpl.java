package com.xj.file.service.impl;

import com.xj.file.db.dao.FileHomeDao;
import com.xj.file.model.FileHome;
import com.xj.file.service.FileDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FileDetailsServiceImpl implements FileDetailsService {

    @Resource
    private FileHomeDao fileHomeDao;

    @Override
    public List<FileHome> queryFileByParams() {

        Map<String, Object> map = new HashMap<>();
        map.put("isVaild", 1);
        List<FileHome> fileHomes = fileHomeDao.find(map);


        return null;
    }
}
