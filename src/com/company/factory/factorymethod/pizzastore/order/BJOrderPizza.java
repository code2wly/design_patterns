package com.company.factory.factorymethod.pizzastore.order;

import com.company.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.company.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.company.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("北京的芝士披萨");
        }else if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
            pizza.setName("北京的希腊风味披萨");
        }
        return pizza;
    }
}
