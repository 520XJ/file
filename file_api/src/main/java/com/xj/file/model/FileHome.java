package com.xj.file.model;

public class FileHome {
    /**
     * id
     * 
     */
    private Integer id;

    /**
     * file_name
     * 文件名
     */
    private String fileName;

    /**
     * file_stream
     * 文件2进制流
     */
    private String fileStream;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileStream() {
        return fileStream;
    }

    public void setFileStream(String fileStream) {
        this.fileStream = fileStream;
    }
}