package com.company.principle.ocp.improve;

/**
 * 开闭原则是编程中最基础、最重要的设计原则
 * ❶一个软件实体如类，模块和函数应该对扩展开放（提供方），对修改关闭（使用方），用抽象构建框架，用实现扩展细节
 * ❷当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化
 * ❸编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则
 */
public class Ocp02 {
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
        s.draw();
    }
}

/**
 * 把创建的Share类做成抽象类，并且提供一个抽象的draw()方法，让子类实现即可
 * 这样我们有新的图形种类时，只要让新的图形类继承Shape,并且实现draw()方法即可
 * 使用方的代码就不需要修改
 */
abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}