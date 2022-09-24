package com.company.prototype.deepclone;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    //方式一：重写clone()方法来实现深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //对基本数据类型的成员变量进行拷贝
        deep = super.clone();
        //对引用类型的成员变量进行拷贝
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        DeepCloneableTarget deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
        return super.clone();
    }

    //方式二：通过对象序列化实现深拷贝(推荐)
    public Object deepClone() {
        //创建流对象
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //输出对象
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                //关闭流
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
