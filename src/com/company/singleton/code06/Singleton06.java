package com.company.singleton.code06;

/**
 * 单例模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 */
public class Singleton06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1哈希值：" + instance1.hashCode());
        System.out.println("instance2哈希值：" + instance2.hashCode());
    }
}

/**
 * 双重检查
 * ❶Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if (instance == null)检查，这样就可以保证线程安全了。
 * ❷这样，实例化代码只用执行一次，后面再次访问时，判断if (instance == null)，直接return实例化对象，也避免的反复进行方法同步.
 * ❸线程安全；延迟加载；效率较高
 * ❹结论：在实际开发中，推荐使用这种单例设计模式
 */
class Singleton {
    private volatile static Singleton instance;

    //构造器私有化 (防止 new )
    private Singleton() {
    }

    //对外提供一个公有的静态方法，加入了双重检查代码，解决了线程安全问题，同时解决了懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            //加入了同步代码块，解决线程不安全问题
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}