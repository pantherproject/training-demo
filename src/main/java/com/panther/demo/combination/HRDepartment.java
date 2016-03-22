package com.panther.demo.combination;

/**
 * Leaf：在组合中表示叶子结点对象，叶子结点没有子结点。
 * Created by panther.dongdong on 2016/3/22.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }


    @Override
    protected void add(Company company) {

    }

    @Override
    protected void remove(Company company) {

    }

    @Override
    protected void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < depth; ++i) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder) + this.getName());
    }
}
