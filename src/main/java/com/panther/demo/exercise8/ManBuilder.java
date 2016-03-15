package com.panther.demo.exercise8;

/**
 * 男人建造类
 * Created by panther.dongdong on 2016/3/14.
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder(Person person) {
        this.person = person;
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return this.person;
    }
}
