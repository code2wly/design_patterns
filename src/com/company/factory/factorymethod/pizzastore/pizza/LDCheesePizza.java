package com.company.factory.factorymethod.pizzastore.pizza;
//伦敦的芝士披萨
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作伦敦的芝士披萨 准备原材料...");
    }
}
