package com.company.singleton.code07;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 静态内部类
 * ❶这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * ❷静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，
 * 调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * ❸类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * ❹优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * ❺结论：推荐使用.
 */
class Singleton {
    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //静态内部类（只会装载一次，装载的过程是线程安全的）
    private static class SingletonInstance {
        //静态属性
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供一个公有的静态方法，当使用到该方法时，才去创建对象实例
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}