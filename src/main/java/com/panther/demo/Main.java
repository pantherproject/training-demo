package com.panther.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * test demo
 * Created by panther.dongdong on 2016/2/29.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("test...");
//        String s = "Exception in thread \"main\" java.lang.IllegalArgumentException:";
//        Pattern pattern = Pattern.compile(" java\\.lang\\..*Exception");
//        Matcher m = pattern.matcher(s);
//        while (m.find()) {
//            System.out.println(m.group());
//        }


//        String s = "Caused by: java.lang.ArrayIndexOutOfBoundsException: 4";
//        System.out.println(s.matches("^Caused by: java\\.lang\\..*Exception.*"));
        System.out.println(mm.MM.name());
        System.out.println(mm.kk.name());
        String s = "m";
    }

    enum mm {
        MM, kk
    }
}
