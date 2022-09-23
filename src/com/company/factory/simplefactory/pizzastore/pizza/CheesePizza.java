package com.company.factory.simplefactory.pizzastore.pizza;

//芝士披萨
public class CheesePizza extends Pizza{
    //准备原材料
    @Override
    public void prepare() {
        System.out.println("给制作芝士披萨 准备原材料...");
    }
}
