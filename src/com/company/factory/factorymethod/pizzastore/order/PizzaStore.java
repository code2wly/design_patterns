package com.company.factory.factorymethod.pizzastore.order;

//披萨店
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种披萨
        new BJOrderPizza();
        System.out.println("--退出程序...");
    }
}
