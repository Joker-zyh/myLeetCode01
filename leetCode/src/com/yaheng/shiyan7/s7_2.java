package com.yaheng.shiyan7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class s7_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try(
                FileInputStream fis = new FileInputStream("E:\\照片\\查理普斯1.jpg");
                FileOutputStream fos = new FileOutputStream("E:\\照片\\查理普斯4.jpg")
                ){
            byte[] buffer =new byte[1024];
            int b;
            while ((b = fis.read(buffer)) != -1){
                fos.write(buffer,0,b);
            }
            System.out.println("复制完成。");

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("文件字节流复制图片所用时间为：" + (endTime - startTime) + "毫秒");

        long startTime1 = System.currentTimeMillis();
        try(
                FileInputStream is = new FileInputStream("E:\\照片\\查理普斯1.jpg");
                BufferedInputStream bis = new BufferedInputStream(is);

                FileOutputStream os = new FileOutputStream("E:\\照片\\查理普斯5.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成。");

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("文件字节流复制图片所用时间为：" + (endTime1 - startTime1) + "毫秒");

    }
}
