package com.company.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype p = new DeepPrototype();
        p.name = "深拷贝";
        p.deepCloneableTarget = new DeepCloneableTarget("tom", "引用类型");

        //方式一：重写clone()方法来实现深拷贝
        //DeepPrototype p2 = (DeepPrototype) p.clone();
        //DeepPrototype p3 = (DeepPrototype) p.clone();
        //DeepPrototype p4 = (DeepPrototype) p.clone();

        //方式二：通过对象序列化实现深拷贝(推荐)
        DeepPrototype p2 = (DeepPrototype) p.deepClone();
        DeepPrototype p3 = (DeepPrototype) p.deepClone();
        DeepPrototype p4 = (DeepPrototype) p.deepClone();

        System.out.println(p + "\t哈希值：" + p.deepCloneableTarget.hashCode());
        System.out.println(p2+ "\t哈希值：" + p2.deepCloneableTarget.hashCode());
        System.out.println(p3+ "\t哈希值：" + p3.deepCloneableTarget.hashCode());
        System.out.println(p4+ "\t哈希值：" + p4.deepCloneableTarget.hashCode());
    }
}
