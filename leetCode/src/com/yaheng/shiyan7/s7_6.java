package com.yaheng.shiyan7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class s7_6 {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("E:\\java实验\\s.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java实验\\ss.txt"))
                ){
            String s = br.readLine();
            char[] chars = s.toCharArray();
            List<Character> list = new ArrayList<>();
            for(char c :chars){
                list.add(c);
            }
            Collections.sort(list);
            //System.out.println(list);
            for(char c : list){
                bw.write(c);
            }
            System.out.println("任务完成。");
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
