package com.nyist.secondshop.utils;


import java.io.File;


/**
 * Created by chao on 2018/5/6.
 */
public class FileCheck {

    public String checkGoodFolderExist(String filePath){
        Boolean success = false;
        String classpath = FileCheck.class.getResource("/").getPath().replaceFirst("/", "");
        String path = classpath.replaceAll("/WEB-INF/classes/", "") + filePath;
        File file = new File(path);
        success = checkFileExist(file);
        if (success){
            return path + "/";
        }else {
            return "";
        }
    }

    public Boolean checkFileExist(File file){
        if (file.exists()){
            System.out.println("文件夹已存在！");
            return true;
        } else {
            System.out.println("文件夹不存在，正在创建！");
            file.mkdirs();
            if (file.exists()){
                System.out.println("文件夹创建成功！");
                return true;
            } else {
                System.out.println("创建失败！");
                return false;
            }
        }
    }
}
