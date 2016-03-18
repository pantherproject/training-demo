package com.panther.demo.meditor;

/**
 * 中介者接口
 * Created by panther.dongdong on 2016/3/17.
 */
public interface Mediator {
    public void createMediator(); //创造中介者

    public void workAll(); //中介者的工作，维护类之间的依赖关系
}
