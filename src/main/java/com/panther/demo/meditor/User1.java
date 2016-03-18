package com.panther.demo.meditor;

/**
 * 用户1
 * Created by panther.dongdong on 2016/3/17.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }


}
