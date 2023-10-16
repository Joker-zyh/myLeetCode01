package com.yaheng.shiyan7;

import java.io.*;

public class s7_5 {
    public static void main(String[] args) {
        File file = new File("E:");
        File[] files = file.listFiles();

        int i = 1;
        for(File f : files){
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    try(
                            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getAbsoluteFile()));
                            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\java实验\\s7_5_" + i +".java"));
                            ){
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = bis.read(buffer)) != -1){
                            bos.write(buffer,0,len);
                        }
                        System.out.println("复制成功。");
                        i++;
                    }catch (Exception e){
                        System.out.println(e.fillInStackTrace());
                    }
                }
            }
        }
    }
}
