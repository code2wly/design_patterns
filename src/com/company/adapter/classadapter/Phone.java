package com.company.adapter.classadapter;

//手机
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电...");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压过高，已停止充电...");
        }
    }
}
