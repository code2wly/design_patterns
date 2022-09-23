package com.company.uml.dependence;

/**
 * 依赖关系：只要在类中用到了对方，那么他们之间就存在依赖关系
 */
public class PersonServiceBean {
    //类的成员属性
    private PersonDao personDao;
    //方法接收的参数类型
    public void save(Person person) {
    }
    //方法的返回类型
    public IDCard getIDCard(Integer personid) {
        return null;
    }
    //方法体内部使用到
    public void modify() {
        Department department = new Department();
    }
}
