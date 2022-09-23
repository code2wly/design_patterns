package com.company.factory.factorymethod.pizzastore.pizza;
//伦敦的希腊风味披萨
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作伦敦的希腊风味披萨 准备原材料...");
    }
}
