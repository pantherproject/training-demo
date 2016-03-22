package com.panther.demo.combination;

/**
 * 客户端调用测试
 * Created by panther.dongdong on 2016/3/22.
 */
public class Client {
    public static void main(String[] args) {
        Company root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部门"));
        root.add(new FinanceDepartment("总公司财务部门"));
        Company shandongCom = new ConcreteCompany("山东分公司");
        shandongCom.add(new HRDepartment("山东分公司人力资源部"));
        shandongCom.add(new FinanceDepartment("山东分公司财务部"));
        Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
        zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));
        zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部"));
        Company jinanCom = new ConcreteCompany("济南办事处");
    }
}
