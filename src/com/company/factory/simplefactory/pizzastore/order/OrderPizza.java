package com.company.factory.simplefactory.pizzastore.order;

import com.company.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.company.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.company.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购披萨
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊风味披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");
            } else {
                break;
            }
            //输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //获取订购披萨的类型
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
