package com.company.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。
 * 也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。
 * 对外除了提供的public方法，不对外泄漏任何信息
 * <p>
 * 迪米特法则还有个更简单的定义：只与直接的朋友通信
 * 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，
 * 我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。
 * 其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在
 * 局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部
 * <p>
 * 迪米特法则的核心是降低类之间（对象间）耦合关系，并不是要求完全没有依赖关系
 */
public class Demeter2 {
    public static void main(String[] args) {
        //有一个学校，下属有各个学院和总部，现在要求打印从学校总部员工id和学院员工id
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

    }

}

//学校总部员工类
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院员工类
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院管理类
class CollegeManager {
    //获取所有的学院员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //输出所有的学院员工
    public void printAllEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校的管理类
class SchoolManager {
    //获取所有的学校总部员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //打印所有的员工信息
    void printAllEmployee(CollegeManager sub) {
        //输出所有的学院员工
        sub.printAllEmployee();
        //输出所有的学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
