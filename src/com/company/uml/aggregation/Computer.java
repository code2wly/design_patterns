package com.company.uml.aggregation;


/**
 * 聚合关系：表示的是整体和部分的关系，整体与部分可以分开。
 * 集合关系是关联关系的特例，所以它具有关联关系的导航行与多重性
 */
public class Computer {
    private Keyboard keyboard; //键盘可以与Computer分离
    private Monitor monitor; //显示器与Computer分离

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
