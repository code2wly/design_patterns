package com.company.singleton.code01;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态常量）
 * ❶优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 * ❷缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 * ❸分析：这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance方法，
 * 但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance就没有达到lazy loading的效果
 * ❹结论：这种单例模式可用，可能造成内存浪费
 */
class Singleton {
    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //对外提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}