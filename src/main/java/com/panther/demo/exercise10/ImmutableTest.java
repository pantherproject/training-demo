package com.panther.demo.exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 不可变集合测试
 * Created by panther.dongdong on 2016/3/17.
 */
public class ImmutableTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        List<String> unmodifiableList = Collections.unmodifiableList(list);


        System.out.println(unmodifiableList);

        List<String> unmodifiableList1 = Collections.unmodifiableList(Arrays.asList("a", "b", "c"));

        System.out.println(unmodifiableList1);

        String temp = unmodifiableList.get(1);
        System.out.println(temp);

        list.add("bady");
        System.out.println(list);
        System.out.println(unmodifiableList);

        unmodifiableList1.add("bb");
        System.out.println(unmodifiableList1);

        unmodifiableList.add("cc");
        System.out.println(unmodifiableList);
    }
}
