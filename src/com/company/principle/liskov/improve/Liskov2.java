package com.company.principle.liskov.improve;

/**
 * 里氏替换原则
 * ❶继承在给程序设计带来便利的同时，也带来了弊端，比如使用继承会给程序带来侵入性，
 * 程序的可移植性降低，增加对象间的耦合性，如果一个类被其他类所继承，则当这个类被
 * 修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子类的功能都有可能产生故障
 * ❷在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类发方法
 * ❸里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决问题
 */
public class Liskov2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-------------------");

        B b = new B();
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

/**
 * 原来的父类和子类都继承一个更通俗的类，原有的继承关系去掉，采用依赖，聚合，组合等关系替代
 */
class Base {
}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {
    private A a = new A();
    //如果B需要使用A类的方法，使用组合关系
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

    public int func1(int a, int b) {
        return a + b;
    }

    //完成两数相加，然后和9求和
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
