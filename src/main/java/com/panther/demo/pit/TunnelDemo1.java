package com.panther.demo.pit;

/**
 * 坑一
 * Created by panther.dongdong on 2016/3/10.
 */
public class TunnelDemo1 {
    public static void main(String[] args) {
        char a = 'a';
        int i = 0;
        System.out.println(true ? a : 0);
        System.out.println(false ? i : a);
    }
}


//谜题7：互换内容
//public class CleverSwap{
//    public static void main(String[] args){
//        int x = 1984; // (0x7c0)
//        int y = 2001; // (0x7d1)
//        x^= y^= x^= y;
//        System.out.println("x= " + x + "; y= " + y);
//    }
//}
//它会打印出什么呢？
//        x = 0111 1100 0000 ,y = 0111 1101 0001 x^=y,后 x = 0000 0001 0001
//        y^=x  后y = 0111 1100  0000  x^=y 后  x = 0111 1101  0001
//        所以 x =  0x7d1      y = 0x7c0
//        很好嘛！不用中间变量的swap方法。但是打印的结果出乎意料：x = 0; y = 1984
//        郁闷哪！
//        Java语言规范描述到：操作符的操作数是从左向右求值的。为了求表达式 x ^= expr的值，
//        x的值是在计算expr之前被提取的，并且这两个值的异或结果被赋给变量x。在CleverSwap程序中，
//        变量x的值被提取了两次——每次在表达式中出现时都提取一次——但是两次提取都发生在所有的
//        赋值操作之前。
//        按编译时引入中间变量的方法来分解x^= y^= x^= y，
//        x = x ^(y^x^y) : x与y两次xor， 结果还是x ，x xor x ，结果是0 ，故最终得0；
//        int tmp1 = x ; // x在表达式中第一次出现
//        int tmp2 = y ; // y的第一次出现
//        int tmp3 = x ^ y ; // 计算x ^ y
//        x = tmp3 ; // 最后一个赋值：存储x ^ y 到 x
//        y = tmp2 ^ tmp3 ; // 第二个赋值：存储最初的x值到y中
//        x = tmp1 ^ y ; // 第一个赋值：存储0到x中
//        solution：
//        丑陋而又无用的解法：
//        y = (x^= (y^= x))^ y
//        最好的方法是不要这么干！不想使用中间变量我们可以这样：{a = a + b; b = a - b;a = a - b};