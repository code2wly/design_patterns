package com.company.singleton.code05;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 懒汉式(线程安全，同步代码块)
 * ❶这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的的代码块
 * ❷但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一致，假如一个线程进入了if (instance == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
 * ❸结论：在实际开发中，不能使用这种方式
 */
class Singleton {
    private static Singleton instance;

    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //对外提供一个公有的静态方法，当使用到该方法时，才去创建对象实例
    public static Singleton getInstance() {
        if (instance == null) {
            //加入了同步代码块，解决线程不安全问题
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}