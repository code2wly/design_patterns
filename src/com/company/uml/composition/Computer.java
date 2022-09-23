package com.company.uml.composition;


import com.company.uml.aggregation.Keyboard;
import com.company.uml.aggregation.Monitor;

/**
 * 组合关系：表示的是整体和部分的关系，整体与部分不可以分开。
 */
public class Computer {
    private Keyboard keyboard = new Keyboard(); //键盘不可以与Computer分离
    private Monitor monitor = new Monitor(); //显示器不可以与Computer分离
}
