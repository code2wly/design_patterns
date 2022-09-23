package com.company.factory.factorymethod.pizzastore.order;

import com.company.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.company.factory.factorymethod.pizzastore.pizza.LDGreekPizza;
import com.company.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("伦敦的芝士披萨");
        }else if (orderType.equals("greek")){
            pizza = new LDGreekPizza();
            pizza.setName("伦敦的希腊风味披萨");
        }
        return pizza;
    }
}
