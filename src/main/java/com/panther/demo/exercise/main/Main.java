package com.panther.demo.exercise.main;

import com.panther.demo.exercise.deal.ExceDeal;
import com.panther.demo.exercise.entity.StackInformation;

/**
 * 主逻辑入口
 * 1. 给定如下一个异常栈，要求解析出完整的异常链（要求能够知道所有的异常类型，对应的栈信息，以及根异常。注意抽象）
 * Exception in thread "main" java.lang.IllegalArgumentException: 非法的参数
 * at qunar.tc.imgrender.utils.Utils.main(Utils.java:138)
 * at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * at java.lang.reflect.Method.invoke(Method.java:497)
 * at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
 * Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
 * at qunar.tc.imgrender.utils.Utils.test(Utils.java:144)
 * at qunar.tc.imgrender.utils.Utils.main(Utils.java:136)
 * ... 5 more
 * 按照如下格式将结果输出在控制台上
 * Exceptions are: java.lang.IllegalArgumentException, java.lang.ArrayIndexOutOfBoundsException
 * Root exception is:
 * java.lang.ArrayIndexOutOfBoundsException: 4
 * at qunar.tc.imgrender.utils.Utils.test(Utils.java:144)
 * at qunar.tc.imgrender.utils.Utils.main(Utils.java:136)
 * ... 5 more
 * Created by panther.dongdong on 2016/2/29.
 */
public class Main {
    private static final String IN_FILE = "./src/main/resources/exercise/in";


    public static void main(String[] args) {
        StackInformation stackInformation = ExceDeal.getInstance().deal(IN_FILE);
        System.out.println(stackInformation.toString());
    }
}
