package com.panther.demo.exercise8;

/**
 * 指导具体的调用者
 * Created by panther.dongdong on 2016/3/14.
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
