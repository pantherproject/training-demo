package com.panther.demo.combination;

/**
 * 叶子节点
 * Created by panther.dongdong on 2016/3/22.
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
