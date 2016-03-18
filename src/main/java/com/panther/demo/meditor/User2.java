package com.panther.demo.meditor;

/**
 * 用户2
 * Created by panther.dongdong on 2016/3/17.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe1");
    }
}
