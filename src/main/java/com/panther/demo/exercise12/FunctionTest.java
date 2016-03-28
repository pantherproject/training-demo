package com.panther.demo.exercise12;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/**
 * 函数式接口测试
 * Created by panther.dongdong on 2016/3/21.
 */
public class FunctionTest {
    public static void main(String[] args) {
        Set<String> stringSet = Sets.newHashSet();
        System.out.println(stringSet instanceof SortedSet);
        stringSet.add("aaa");
        stringSet.add("abc");
        stringSet.add("bbb");
        stringSet.add("bbc");
        Set<String> resultSet = Sets.filter(stringSet, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.contains("b");
            }
        });
        Iterator<String> resultIterators = resultSet.iterator();
        while (resultIterators.hasNext()) {
            System.out.println(resultIterators.next());
        }
    }
}
