package com.yaheng.shiyan6.s6_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",123456);
        map.put("李四",132333);
        map.put("王五",123569);
        map.put("麻子",121556);
        map.put("老王",113858);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for (Map.Entry<String,Integer> e: set
             ) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
