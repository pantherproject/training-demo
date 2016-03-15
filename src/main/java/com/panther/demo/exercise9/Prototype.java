package com.panther.demo.exercise9;

import java.io.*;

/**
 * 对象的深复制和浅复制
 * Created by panther.dongdong on 2016/3/15.
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = -3346888925332166469L;

    private String string;

    private SerializableObject serializableObject;

    //浅复制
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
        objectOutputStream.writeObject(this);

        //读出二进制流产生新对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }

    class SerializableObject implements Serializable {

        private static final long serialVersionUID = -7728443971130605297L;
    }

    public static void test(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        short a = 'a';
        Prototype.test(a);
    }
}
