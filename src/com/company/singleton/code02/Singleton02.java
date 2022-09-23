package com.company.singleton.code02;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 * ❶这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，
 * 也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * ❷结论：这种单例模式可用，但是可能造成内存浪费
 */
class Singleton {
    private static Singleton instance;

    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //在静态代码块中创建对象实例
    static {
        instance = new Singleton();
    }

    //对外提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}