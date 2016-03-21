package com.panther.demo.exercise11;

/**
 * 递归，伪递归，迭代实现n!
 * Created by panther.dongdong on 2016/3/18.
 */
public class RecursionTest {
    public static void main(String[] args) {

        System.out.println(recurse(5)); //递归显示
        System.out.println(camouflageRecurse(5, 1)); //伪递归
        System.out.println(iteration(5)); //迭代
    }

    /**
     * n的阶乘，伪递归实现方式
     *
     * @param n
     * @param result 计算保存的中间结果
     * @return 最终结果
     */
    public static int camouflageRecurse(int n, int result) {
        if (n == 1) {
            return result;
        } else {
            result = result * n;
            return camouflageRecurse(n - 1, result);
        }
    }

    /**
     * 求 n 的阶乘递归调用方式
     *
     * @param n n个数的阶乘
     * @return n个数阶乘的结果
     */
    public static int recurse(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recurse(n - 1);
        }
    }

    /**
     * 用迭代的方法实现n的阶乘
     *
     * @param n
     * @return
     */
    public static int iteration(int n) {
        int result = 1;
        for (int i = 2; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
}
