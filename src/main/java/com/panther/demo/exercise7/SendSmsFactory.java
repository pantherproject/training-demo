package com.panther.demo.exercise7;

/**
 * 短信发送工厂
 * Created by panther.dongdong on 2016/3/13.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
