package com.company.principle.singleresponsibility;
/**
 * 单一职责原则：对于类来说，即一个类应该只负责一项职责
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

    }
}

/**
 * 交通工具类
 * 该类遵守了单一职责原则（一个类负责一项职责），但是这样做的改动很大（将类分解，同时修改客户端）
 * 改进：直接修改Vehicle类，改动的代码较少
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶......");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空中行驶......");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在大海里行驶......");
    }
}
