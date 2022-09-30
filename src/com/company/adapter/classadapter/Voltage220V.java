package com.company.adapter.classadapter;

//被适配者
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压：" + src + "伏");
        return src;
    }
}
