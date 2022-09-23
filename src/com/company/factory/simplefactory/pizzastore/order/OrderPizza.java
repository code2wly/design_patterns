package com.company.factory.simplefactory.pizzastore.order;


import com.company.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购披萨
public class OrderPizza {
    //定义一个简单工厂对象
    SimplePizzaFactory simplePizzaFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setSimplePizzaFactory(simplePizzaFactory);
    }


    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        String orderType = "";
        this.simplePizzaFactory = simplePizzaFactory;
        do {
            //使用简单工厂模式订购披萨
            orderType = getType();
            pizza = simplePizzaFactory.createPizza(orderType);
            //输出pizza制作过程
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                System.out.println("抱歉，没有该类型的披萨啦~");
                break;
            }
        } while (true);
    }

    //获取订购披萨的类型
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type：");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
