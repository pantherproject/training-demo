package com.panther.demo.exercise7;

/**
 * 普通工厂类
 * Created by panther.dongdong on 2016/3/13.
 */
public class SendFactory {
//    private static final String MAIL_TYPE = "mail";
//    private static final String SMS_TYPE = "sms";
//
//    public Sender produce(String type) {
//        if (MAIL_TYPE.equals(type)) {
//            return new MailSender();
//        } else if (SMS_TYPE.equals(type)) {
//            return new SmsSender();
//        } else {
//            throw new RuntimeException("请输入正确的发送类型！！！");
//        }
//    }

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
