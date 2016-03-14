package com.panther.demo.exercise8;

/**
 * builder模式
 * Created by panther.dongdong on 2016/3/14.
 */
public class Student {
    private int age;
    private String name;
    private String sex;

    private Student(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.sex = builder.sex;
    }

    public static Builder create() {
        return new Builder();
    }

    private static class Builder {
        private int age;
        private String name;
        private String sex;

        public Builder addAge(int age) {
            this.age = age;
            return this;
        }

        public Builder addName(String name) {
            this.name = name;
            return this;
        }

        public Builder addSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = Student.create().addAge(18).addName("panther").addSex("男").build();
        System.out.println(student.toString());
    }
}
