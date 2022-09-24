package com.company.prototype;
/**
 * 现在有一只羊tom，姓名为: tom, 年龄为：1，颜色为：白色，请编写程序创建和tom羊 属性完全相同的10只羊。
 */
public class Client {
    public static void main(String[] args) {
        /*
        传统方式
        优点是比较好理解，简单易操作。
        在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
        总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活
         */
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
