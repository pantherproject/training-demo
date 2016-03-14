package com.panther.demo.exercise7;

/**
 * 邮件发送实现类
 * Created by panther.dongdong on 2016/3/13.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
