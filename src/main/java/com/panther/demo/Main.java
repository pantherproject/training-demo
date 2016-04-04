package com.panther.demo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * test demo
 * Created by panther.dongdong on 2016/2/29.
 */
public class Main {
    public static void main(String[] args) {
//        List<Object> objectList = new ArrayList<>();
//        objectList.add("123");
//        objectList.add(123);
//        List<String> stringList = new ArrayList<>();
//        System.out.println(objectList);

        Map<String, Object> objectMap = Maps.newHashMap();
        objectMap.put("123", 123);
        objectMap.put("456", "456");

        float s = 123;
        System.out.println(Float.isNaN(s));
    }
}
