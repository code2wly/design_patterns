package com.company.factory.factorymethod.pizzastore.pizza;
//北京的芝士披萨
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作北京的芝士披萨 准备原材料...");
    }
}
