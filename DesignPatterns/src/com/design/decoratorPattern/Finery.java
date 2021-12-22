package com.design.decoratorPattern;

/**
 * 服饰类 Decorator
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:14
 */
public class Finery extends Person{

    protected Person persons;

    public Finery(Person person) {
        this.persons = person;
    }

    @Override
    public void show(){
        if (persons != null){
            persons.show();
        }
    }
}
