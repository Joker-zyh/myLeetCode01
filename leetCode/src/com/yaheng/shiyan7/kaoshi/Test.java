package com.yaheng.shiyan7.kaoshi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Employee e = new Employee();
            System.out.println("请输入：" + (i+1) + "号雇员的编号：");
            e.setId(sc.next());
            System.out.println("请输入：" + (i+1) + "号雇员的薪水：");
            e.setMoney(sc.nextDouble());
            map.put(e.getId(),e.getMoney());
        }

        try(
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\out.txt"))
                ){
            //2.根据编号查找
            System.out.println("请输入要查找雇员的编号：");
            String eid = sc.next();
            Set<String> set1 = map.keySet();
            boolean flag = true;
            for(String s : set1){
                if(s.equals(eid)){
                    System.out.println("该雇员工资为：" + map.get(s));
                    String s1 = "该雇员工资为：" + map.get(s);
                    byte[] buffer = s1.getBytes(StandardCharsets.UTF_8);
                    bos.write(buffer,0,buffer.length);

                    flag = false;
                }
            }
            if (flag){
                System.out.println("查无此人。");
            }

            //3.遍历map
            Set<Map.Entry<String,Double>> set2 =  map.entrySet();
            for (Map.Entry<String,Double> e:set2){
                System.out.println("雇员" + e.getKey() + "的薪水是：" + e.getValue());
                String s2 = "雇员" + e.getKey() + "的薪水是：" + e.getValue();
                byte[] buffer = s2.getBytes(StandardCharsets.UTF_8);
                bos.write(buffer,0,buffer.length);

            }

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
            throw  new RuntimeException();
        }





    }
}

