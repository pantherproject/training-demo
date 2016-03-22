package com.panther.demo.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite：定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等。
 * Created by panther.dongdong on 2016/3/22.
 */
public class ConcreteCompany extends Company {
    private List<Company> companyList;

    public ConcreteCompany() {
        companyList = new ArrayList<>();
    }

    public ConcreteCompany(String name) {
        super(name);
        companyList = new ArrayList<>();
    }

    @Override
    protected void add(Company company) {
        companyList.add(company);
    }

    @Override
    protected void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    protected void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < depth; ++i) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder) + this.getName());
        for (Company company : companyList) {
            company.display(depth + 2);
        }
    }


}
