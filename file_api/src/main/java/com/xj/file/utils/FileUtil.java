package com.xj.file.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *  xiong
 *   1，转文件为base64 时 必须具体到文件地址，不能为文件夹
 *   2，base64 解码保存文件时 必须具体到文件地址 不能为文件夹，
 *                          解决思路： 获取上传文件得文件名，在保存目录下创建个同名的空文件，再写入
 */
public class FileUtil {

    /**
     * 将文件转成base64 字符串
     * @param // path文件路径
     * @return Base64 字符串
     * @throws Exception
     */
    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);;
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);

    }

    /**
     * 将base64字符解码保存文件
     * @param base64Code base 64 字符串
     * @param targetPath    保存地址
     * @param fileName  文件名
     * @throws Exception
     */
    public static void decoderBase64File(String base64Code, String targetPath,String fileName)
            throws Exception {
        File file = new File(targetPath);
        if(!file.isDirectory()){
            System.out.println("文件夹不存在");
            file.mkdir();//创建一个文件夹
        }

       /* if(!file.exists()){
            file.createNewFile();
        }*/

        String filePath = file.toString();
        String path = filePath + fileName;
        File file1 = new File(path);
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        FileOutputStream out = new FileOutputStream(file1);
        out.write(buffer);
        out.close();

    }

    /**
     * 将base64字符保存文本文件
     * @param base64Code
     * @param targetPath
     * @throws Exception
     *
     */
    public static void toFile(String base64Code, String targetPath)
            throws Exception {
        File file = new File(targetPath); //传入的路径如果不存在就创建个
        if(!file.exists()&&!file.isDirectory()){
            file.mkdir();
        }
        String filePath = file.toString();
        byte[] buffer = base64Code.getBytes();
        FileOutputStream out = new FileOutputStream(filePath);
        out.write(buffer);
        out.close();
    }

    public static void main(String[] args)  {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}