package com.company.builder.improve;

/**
 * Director（指挥者）： 构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。
 * 它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //通过构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //负责控制产品对象的生产过程
    public House createHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
