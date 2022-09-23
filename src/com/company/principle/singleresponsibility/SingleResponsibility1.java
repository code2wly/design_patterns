package com.company.principle.singleresponsibility;

/**
 * 单一职责原则：对于类来说，即一个类应该只负责一项职责
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle01 vehicle = new Vehicle01();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

/**
 * 交通工具类
 * 该类违反了单一职责原则（一个类负责多项职责）
 * 改进：需要根据交通工具运行方法的不同，分解成不同类即可
 */
class Vehicle01 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶......");
    }
}