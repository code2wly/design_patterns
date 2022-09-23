package com.company.factory.factorymethod.pizzastore.order;

import com.company.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.company.factory.factorymethod.pizzastore.pizza.LDGreekPizza;
import com.company.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("--使用工厂方法模式...");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
