package com.company.factory.simplefactory.pizzastore.pizza;
//希腊风味披萨
public class GreekPizza extends Pizza{
    //准备原材料
    @Override
    public void prepare() {
        System.out.println("给制作希腊风味披萨 准备原材料...");
    }
}
