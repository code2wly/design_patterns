package com.company.builder.improve;

//ConcreteBuilder（具体建造者）： 实现接口，构建和装配各个部件
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给居民房打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("给居民房砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("给居民房封顶...");
    }
}
