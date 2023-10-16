package com.yaheng.shiyan6.s6_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        String[] arr = s.split("[ \\n\\t\\r.,;:!?()]+");

        Map<String,Integer> map = new HashMap<>();
        for (String n:arr) {
            if(map.containsKey(n)){
                int val = map.get(n);
                map.put(n,++val);
            }else {
                map.put(n,1);
            }
        }

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> e:set){
            System.out.println(e.getKey() + "-->" + e.getValue());
        }
    }
}
