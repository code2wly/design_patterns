package com.company.factory.abstractfactory.pizzastore.order;

import com.company.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.company.factory.abstractfactory.pizzastore.pizza.LDGreekPizza;
import com.company.factory.abstractfactory.pizzastore.pizza.Pizza;

//具体实现的工厂子类
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("--使用抽象工厂模式...");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
