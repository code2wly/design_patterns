package com.company.factory.factorymethod.pizzastore.order;

import com.company.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.company.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.company.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("--使用工厂方法模式...");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
