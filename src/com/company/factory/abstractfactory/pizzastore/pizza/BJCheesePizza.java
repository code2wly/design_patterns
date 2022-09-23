package com.company.factory.abstractfactory.pizzastore.pizza;

//北京的芝士披萨
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的芝士披萨");
        System.out.println("给制作北京的芝士披萨 准备原材料...");
    }
}
