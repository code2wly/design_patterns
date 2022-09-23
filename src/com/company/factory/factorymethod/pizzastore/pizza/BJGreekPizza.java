package com.company.factory.factorymethod.pizzastore.pizza;
//北京的希腊风味披萨
public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作北京的希腊风味披萨 准备原材料...");
    }
}
