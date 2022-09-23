package com.company.principle.inversion;

/**
 * 依赖传递的三种方式：接口传递，构造方法传递，setter方式传递
 * ❶底层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好
 * ❷变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利用程序扩展和优化
 * ❸继承时遵循里氏替换原则
 */
public class DependencyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();

        //通过接口传递实现依赖
        //OpenAndClose openAndClose = new OpenAndClose();
        //openAndClose.open(changHong);

        //通过构造器方法实现依赖传递
        //OpenAndClose openAndClose = new OpenAndClose(changHong);
        //openAndClose.open();

        //通过setter方法实现依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }

}

/**
 * 方式一：通过接口传递实现依赖
 * <p>
 * 方式二：通过构造器方法实现依赖传递
 */
//interface IOpenAndClose { //开关接口
//    public void open(ITV tv); //抽象方法，接收接口
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose { //实现IOpenAndClose接口
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
//
//class ChangHong implements ITV { //实现ITV接口
//    @Override
//    public void play() {
//        System.out.println("长虹电视开始正常播放...");
//    }
//}

/**
 * 方式二：通过构造器方法实现依赖传递
 */
//interface IOpenAndClose {
//    public void open(); //抽象方法
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv; //属性
//
//    public OpenAndClose(ITV tv) { //构造器
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}
//class ChangHong implements ITV { //实现ITV接口
//    @Override
//    public void play() {
//        System.out.println("长虹电视开始正常播放...");
//    }
//}

/**
 * 方式三：通过setter方法实现依赖传递
 */
interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}

interface ITV { // ITV接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视开始正常播放...");
    }
}