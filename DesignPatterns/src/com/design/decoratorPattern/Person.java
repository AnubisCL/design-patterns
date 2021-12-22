package com.design.decoratorPattern;

/**
 * Person 类 （ConcreteComponent）
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:11
 */
public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("装扮的人：" + name);
    }
}
