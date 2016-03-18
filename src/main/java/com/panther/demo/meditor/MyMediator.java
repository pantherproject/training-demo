package com.panther.demo.meditor;

/**
 * 实现中介者
 * Created by panther.dongdong on 2016/3/17.
 */
public class MyMediator implements Mediator {

    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
