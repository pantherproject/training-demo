package com.panther.demo;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.qunar.corp.publicservice.common.bean.Environment;
import com.qunar.tc.core.info.api.KeyType;
import com.qunar.tc.core.info.client.encrypt.InfoEncryptClientImpl;

import java.util.ArrayList;
import java.util.List;
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
//        System.out.println(mm.MM.name());
//        System.out.println(mm.kk.name());
//        String s = "m";
//        String s = "8618611400087";
//        InfoEncryptClientImpl infoEncryptClient = new
//                InfoEncryptClientImpl(Environment.valueOf("DEV"));
//        System.out.println(infoEncryptClient.encrypt(s, KeyType.phone));
        List<String> stringList = new ArrayList<String>();
        stringList.add("4");
        stringList.add("2");
        stringList.add("3");
        stringList.add("1");
//        System.out.println(stringList.containsAll(stringList));
//        String s = Joiner.on(",").join(stringList);
//        List<String> stringList1 = Splitter.on(',').trimResults().omitEmptyStrings().splitToList(s);
//        stringList1.containsAll(stringList);
        String s = " abc";
        System.out.println(s.trim());
    }

    enum mm {
        MM, kk
    }
}
