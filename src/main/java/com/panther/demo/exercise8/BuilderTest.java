package com.panther.demo.exercise8;

/**
 * 建造者模式测试类
 * Created by panther.dongdong on 2016/3/14.
 */
public class BuilderTest {
    public static void main(String[] args) {
        ManBuilder manBuilder = new ManBuilder(new Person());
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(manBuilder);
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
