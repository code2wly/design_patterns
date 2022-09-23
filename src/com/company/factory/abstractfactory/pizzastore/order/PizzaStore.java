package com.company.factory.abstractfactory.pizzastore.order;

//披萨店
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种披萨
        new OrderPizza(new LDFactory());
        System.out.println("--退出程序...");
    }
}
