package com.company.singleton.code04;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 懒汉式(线程安全，同步方法)
 * ❶解决了线程不安全问题
 * ❷效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低
 * ❸结论：在实际开发中，不推荐使用这种方式
 */
class Singleton {
    private static Singleton instance;

    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //加入了同步代码，解决线程不安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}