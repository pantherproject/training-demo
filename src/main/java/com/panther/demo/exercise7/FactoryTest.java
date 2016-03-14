package com.panther.demo.exercise7;

/**
 * 抽象工厂测试
 * Created by panther.dongdong on 2016/3/13.
 */
public class FactoryTest {
    public static void main(String[] args) {
//        SendFactory sendFactory = new SendFactory();
//        Sender sender = sendFactory.produce("mail");
//        sender.send();
//        Sender sender = SendFactory.produceMail();
//        sender.send();
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
