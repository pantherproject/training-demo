package com.panther.demo.exercise6;

/**
 * String,StringBuffer,StringBuilder字符串拼接效率对比
 * Created by panther.dongdong on 2016/3/10.
 */
public class StringConnectTimeDemo {
    private final int n = 200000;

    public static void main(String[] args) {
        StringConnectTimeDemo stringConnectTimeDemo = new StringConnectTimeDemo();
        stringConnectTimeDemo.stringTest();
        stringConnectTimeDemo.stringBufferTest();
        stringConnectTimeDemo.stringBuilderTest();
    }

    public void stringTest() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; ++i) {
            s += i;
        }
        System.out.println("string cost time:" + (System.currentTimeMillis() - start));
    }

    public void stringBufferTest() {
        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < n; ++i) {
            s.append(i);
        }
        System.out.println("stringBuffer cost time:" + (System.currentTimeMillis() - start));
    }

    public void stringBuilderTest() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < n; ++i) {
            s.append(i);
        }
        System.out.println("stringBuilder cost time:" + (System.currentTimeMillis() - start));
    }
}
