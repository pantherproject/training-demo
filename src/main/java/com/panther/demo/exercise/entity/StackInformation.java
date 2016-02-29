package com.panther.demo.exercise.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 堆栈bean信息
 * Created by panther.dongdong on 2016/2/29.
 */
public class StackInformation implements Serializable {
    private static final long serialVersionUID = 2176205945440052864L;

    private static final String NEWLINE_CHARACTER = "\n";
    private static final String COMMA_CHARACTER = ",";
    private static final String EXCEINFO = "Exceptions are:";
    private static final String ROOTINFO = "Root exception is:";


    private String root; //根信息
    private List<String> execInfo; //异常信息


    public StackInformation() {
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<String> getExecInfo() {
        return execInfo;
    }

    public void setExecInfo(List<String> execInfo) {
        this.execInfo = execInfo;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(EXCEINFO);
        for (String s : this.execInfo) {
            stringBuilder.append(s).append(COMMA_CHARACTER);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(NEWLINE_CHARACTER);
        stringBuilder.append(ROOTINFO).append(NEWLINE_CHARACTER);
        stringBuilder.append(this.root);
        return stringBuilder.toString();
    }
}
