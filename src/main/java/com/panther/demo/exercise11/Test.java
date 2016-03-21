package com.panther.demo.exercise11;

import java.text.DecimalFormat;

/**
 * Created by panther.dongdong on 2016/3/20.
 */
public class Test {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private static final String LINE_HEAD = "x       x*x     x+x";
    private static final String LINE_TAB = "      ";

    public static void main(String[] args) {
        System.out.println(LINE_HEAD);
        double i = 1.0;
        while (i <= 10.0) {
            System.out.println(i + LINE_TAB + df.format(i * i) + LINE_TAB + df.format(i + i));
            i += 0.5;
        }
    }
}
