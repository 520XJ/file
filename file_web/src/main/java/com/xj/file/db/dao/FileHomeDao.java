package com.xj.file.db.dao;

import com.xj.file.model.FileHome;

public interface FileHomeDao {
    int delete(Integer id);

    int save(FileHome record);

    int saveSte(FileHome record);

    FileHome get(Integer id);

    int updateSte(FileHome record);

    int update(FileHome record);
}