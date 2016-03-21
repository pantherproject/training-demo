package com.panther.demo.exercise11;

/**
 * 斐波那契数列的递归和迭代实现求和
 * 0 1 1 2 3 5 8 13 21 34 55 89
 * Created by panther.dongdong on 2016/3/18.
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(fibonacciRecurse(14));
        System.out.println(fibonacciIteration(14));
        System.out.println(camouflageFibonacci(14, 0));
    }

    /**
     * 递归调用实现斐波那契数列
     *
     * @param n
     * @return
     */
    public static int fibonacciRecurse(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2);
        }
    }


    /**
     * 迭代实现斐波那契数列
     * 0 1 1 2 3 5 8 13 21 34 55 89
     *
     * @param n
     * @return
     */
    public static int fibonacciIteration(int n) {
        int fab = 0; //最终结果 n的值
        int pre = 1; //记录n-1值
        int p = 0; //记录n-2的位置
        if (n == 1) {
            fab = 0;
        } else if (n == 2) {
            fab = 1;
        }
        for (int i = 2; i < n; ++i) {
            fab = pre + p;
            p = pre;
            pre = fab;
        }
        return fab;
    }

    /**
     * 斐波那契数列伪递归实现
     * 0 1 1 2 3 5 8 13 21 34 55 89
     *
     * @param n
     * @return
     */
    public static int camouflageFibonacci(int n, int result) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            result = camouflageFibonacci(n - 1, result) + camouflageFibonacci(n - 2, result);
            return camouflageFibonacci(n - 1, result) + camouflageFibonacci(n - 2, result);
        }
    }
}
