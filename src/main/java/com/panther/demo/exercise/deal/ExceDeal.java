package com.panther.demo.exercise.deal;

import com.panther.demo.exercise.entity.StackInformation;
import com.panther.demo.util.MessageIterator;
import com.panther.demo.util.MessageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 异常处理类
 * Created by panther.dongdong on 2016/2/29.
 */
public class ExceDeal {
    private static final ExceDeal instance = new ExceDeal();
    private static final String MATCH_ROOT = "^Caused by: java\\.lang\\..*Exception.*"; //匹配Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
    private static final String MATCH_INFO = " java\\.lang\\..*Exception"; //匹配 java.lang.IllegalArgumentException

    private static final String NEWLINE_CHARACTER = "\n";

    public static ExceDeal getInstance() {
        return instance;
    }


    public StackInformation deal(String file) {
        MessageLoader messageLoader = new MessageLoader(file); //设置按行读取文件
        MessageIterator messageIterator = messageLoader.loadMessage();
        Pattern pattern = Pattern.compile(MATCH_INFO); //预编译正则
        StackInformation stackInformation = new StackInformation();
        while (messageIterator.hasNext()) {
            String info = messageIterator.next();
            Matcher m = pattern.matcher(info);
            while (m.find()) {
                String matchInfo = m.group();
                if (stackInformation.getExecInfo() == null) { //匹配异常信息
                    List<String> stringList = new ArrayList<String>();
                    stringList.add(matchInfo);
                    stackInformation.setExecInfo(stringList);
                } else {
                    List<String> stringList = stackInformation.getExecInfo();
                    stringList.add(matchInfo);
                    stackInformation.setExecInfo(stringList);
                }
            }
            if (info.matches(MATCH_ROOT)) { //匹配根异常开始位置
                StringBuilder root = new StringBuilder(info.substring(11, info.length()) + NEWLINE_CHARACTER);
                while (messageIterator.hasNext()) {
                    root.append(messageIterator.next() + NEWLINE_CHARACTER);
                }
                stackInformation.setRoot(root.toString());
            }
        }
        return stackInformation;
    }
}
