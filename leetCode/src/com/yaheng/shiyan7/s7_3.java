package com.yaheng.shiyan7;

import com.yaheng.shiyan6.s6_4.Person;

import java.io.*;

public class s7_3 {
    public static void main(String[] args) {
        //1.字符输入输出流
        try(
                FileReader fr1 = new FileReader("E:\\java实验\\实验7.txt");
                FileReader fr2 = new FileReader("E:\\java实验\\实验7.txt");
                FileWriter fw1 = new FileWriter("E:\\java实验\\实验7_1.txt");
                FileWriter fw2 = new FileWriter("E:\\java实验\\实验7_2.txt")
                ){
            int a;
            while ((a = fr1.read()) != -1){
                fw1.write(a);
            }
            System.out.println("字符输入输出流 字符 复制成功。");

            char[] buffer = new char[1024];
            int len = 0;
            while ((len = fr2.read(buffer)) != -1){
                fw2.write(buffer,0,len);
            }
            System.out.println("字符输入输出流 数组 复制成功。");

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        //2.字符缓冲输入输出流
        try(
                BufferedReader br = new BufferedReader(new FileReader("E:\\java实验\\实验7.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java实验\\实验7_3.txt"))
                ){
            String line;
            while ((line = br.readLine()) != null){
                bw.write(line);
            }
            System.out.println("字符缓冲输入输出流 复制成功。");
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        //3.转换流
        try(
                InputStreamReader isr1 = new InputStreamReader(new FileInputStream("E:\\java实验\\实验7.txt"));
                OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("E:\\java实验\\实验7_4.txt"));

                InputStreamReader isr2 = new InputStreamReader(new FileInputStream("E:\\java实验\\实验7.txt"));
                OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("E:\\java实验\\实验7_5.txt"));
                ){
            int b;
            while ((b = isr1.read()) != -1){
                osw1.write(b);
            }
            System.out.println("转换流 字符 复制成功。");

            char[] buffer = new char[1024];
            int len;
            while ((len = isr2.read(buffer)) != -1){
                osw2.write(buffer,0,len);
            }
            System.out.println("转换流 数组 复制成功。");

        }catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
