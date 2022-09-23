package com.company.singleton;

/**
 * 单例模式在JDK 应用的源码分析
 * 我们JDK中，java.lang.Runtime就是经典的单例模式(饿汉式)
 */
public class Test {
    public static void main(String[] args) {

    }
}
/**
 * ❶单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
 * ❷当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new
 * ❸单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级对象)，
 * 但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象(比如数据源、session工厂等)
 */
//public class Runtime {
//    private static Runtime currentRuntime = new Runtime();
//
//    public static Runtime getRuntime() {
//        return currentRuntime;
//    }
//
//    private Runtime() {
//    }
//}