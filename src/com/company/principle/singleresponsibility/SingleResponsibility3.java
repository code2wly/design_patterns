package com.company.principle.singleresponsibility;

/**
 * 单一职责原则：对于类来说，即一个类应该只负责一项职责
 * ❶降低类的复杂度，一个类只负责一项职责
 * ❷提高类的可读性，可维护行
 * ❸降低变更引起的风险
 * ❹通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级别违反单一职责原则；
 * 只有类中的方法数量足够少时，可以在方法级别保持单一职责原则
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle02 vehicle = new Vehicle02();
        vehicle.run("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

/**
 * 交通工具类
 * 在类级别上违反了单一职责原则（一个类负责多项职责），但是在方法级别上遵守了单一职责原则（一个方法负责一项职责）
 */
class Vehicle02 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶......");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空中行驶......");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在大海里行驶......");
    }
}
