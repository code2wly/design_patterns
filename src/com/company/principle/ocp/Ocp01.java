package com.company.principle.ocp;

/**
 * 开闭原则是编程中最基础、最重要的设计原则
 * ❶一个软件实体如类，模块和函数应该对扩展开放（提供方），对修改关闭（使用方），用抽象构建框架，用实现扩展细节
 * ❷当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化
 * ❸编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则
 */
public class Ocp01 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//绘图类
class GraphicEditor {
    //接收Shape对象，然后根据type来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        //此处为新增代码
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    //绘制三角形（此处为新增代码）
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}

//Shape基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

/**
 * 当我们新增三角形时，需要对GraphicEditor类（使用方）进行修改，这违反了设计模式的ocp原则
 *
 */
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}