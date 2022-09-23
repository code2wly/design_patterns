package com.company.factory.abstractfactory.pizzastore.pizza;

//伦敦的希腊风味披萨
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的希腊风味披萨");
        System.out.println("给制作伦敦的希腊风味披萨 准备原材料...");
    }
}