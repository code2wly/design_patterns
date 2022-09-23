package com.company.principle.segregation.improve;

/**
 * 接口隔离原则：客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

class B implements Interface01, Interface02 {
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class D implements Interface01, Interface03 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

/**
 * 将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。
 * 也就是采用接口隔离原则
 */
interface Interface01 {
    void operation1();
}

interface Interface02 {
    void operation2();

    void operation3();
}

interface Interface03 {
    void operation4();

    void operation5();
}

//A通过Interface1 会依赖（使用）B，但是A中只会使用到接口的1,2,3 三个方法
class A {
    public void depend1(Interface01 i) {
        i.operation1();
    }

    public void depend2(Interface02 i) {
        i.operation2();
    }

    public void depend3(Interface02 i) {
        i.operation3();
    }

}

//C通过Interface1 会依赖（使用）D，但是C中只会使用到接口的1,4,5 三个方法
class C {
    public void depend1(Interface01 i) {
        i.operation1();
    }

    public void depend4(Interface03 i) {
        i.operation4();
    }

    public void depend5(Interface03 i) {
        i.operation5();
    }
}
