package com.company.builder.improve;

/**
 * 建造者模式
 * ❶建造者模式（Builder Pattern） 又叫生成器模式，是一种对象构建模式。
 * 它可以将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方
 * 法可以构造出不同表现（属性）的对象。
 * ❷建造者模式 是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象
 * 的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 */
public class Client {
    public static void main(String[] args) {
        //居民房
        CommonHouse commonHouse = new CommonHouse();
        //指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //创建房子
        House house = houseDirector.createHouse();
    }
}
