package com.company.builder.improve;

//Builder（抽象建造者）： 创建一个Product对象的各个部件指定的 接口/抽象类。
public abstract class HouseBuilder {

    protected House house = new House();

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //建好房子后，将产品（房子）返回
    public House buildHouse() {
        return house;
    }
}
