package com.company.builder;

public class CommonHouse extends AbstractHouse{
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
