package com.company.principle.inversion;

/**
 * 依赖倒转原则：
 * ❶高层模块不应该依赖底层模块，二者都应该依赖其抽象
 * ❷抽象不应该依赖细节，细节应该依赖抽象
 * ❸依赖倒转的中心思想是面向接口编程
 * ❹依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。
 * 以抽象为基础搭建的架构比以细节为基础搭建的架构要稳定得多。
 * 在Java中，抽象指的是接口或抽象类，细节就是具体的实现类
 * ❺使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现的细节的任务交给它们的实现类去完成
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

//完成Person接收消息的功能
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

//抽象的接口
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {

    public String getInfo() {
        return "电子邮件信息：Hello,Daniel!";
    }
}

class WeChat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信消息：Hi,Daniel!";
    }
}