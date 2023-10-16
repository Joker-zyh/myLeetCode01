package com.yaheng.shiyan7;

import java.io.File;

public class s7_1 {
    public static void main(String[] args) {
        //判断E盘照片文件夹里是否有.jpg文件
        File file = new File("E:\\照片");
        File[] files = file.listFiles();
        for(File f : files){
            String name = f.getName();
            if(name.endsWith(".jpg")){
                System.out.println(name);
            }
        }



    }
}
