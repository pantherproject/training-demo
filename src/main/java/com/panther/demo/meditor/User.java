package com.panther.demo.meditor;

/**
 * 用户类
 * Created by panther.dongdong on 2016/3/17.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
