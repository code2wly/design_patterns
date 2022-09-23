package com.company.factory.factorymethod.pizzastore.pizza;

//抽象的披萨类
public abstract class Pizza {
    protected String name; //名字

    //准备原材料（不同的披萨原材料不一样，我们做成抽象方法）
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    //写名字
    public void setName(String name) {
        this.name = name;
    }
}
