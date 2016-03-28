package com.panther.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * test demo
 * Created by panther.dongdong on 2016/2/29.
 */
public class Main {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add("123");
        objectList.add(123);
        List<String> stringList = new ArrayList<>();
        System.out.println(objectList);
    }
}
