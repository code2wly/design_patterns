package com.company.factory.abstractfactory.pizzastore.order;

import com.company.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//定购披萨
public class OrderPizza {
    AbsFactory absFactory;

    //构造器
    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        this.absFactory = absFactory;
        String orderType = "";
        this.absFactory = absFactory;

        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            //输出pizza制作过程
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                System.out.println("订购失败，没有该类型的披萨~");
                break;
            }
        } while (true);
    }

    //获取订购披萨的类型
    private String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("--input pizza type：");
            String str = string.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
