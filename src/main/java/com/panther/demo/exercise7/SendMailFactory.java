package com.panther.demo.exercise7;

/**
 * 邮件发送工厂
 * Created by panther.dongdong on 2016/3/13.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
