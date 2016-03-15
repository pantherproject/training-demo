package com.panther.demo.exercise8;

/**
 * person builder接口
 * Created by panther.dongdong on 2016/3/14.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
