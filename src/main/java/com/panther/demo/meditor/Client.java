package com.panther.demo.meditor;

/**
 * 客户端调用测试
 * Created by panther.dongdong on 2016/3/18.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
