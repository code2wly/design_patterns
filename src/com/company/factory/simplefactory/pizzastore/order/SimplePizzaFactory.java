package com.company.factory.simplefactory.pizzastore.order;

import com.company.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.company.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.company.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * ❶简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式
 * ❷简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为(代码)
 * ❸在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式.
 */
public class SimplePizzaFactory {

    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        System.out.println("--使用简单工厂模式...");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊风味披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        }
        return pizza;
    }
}
