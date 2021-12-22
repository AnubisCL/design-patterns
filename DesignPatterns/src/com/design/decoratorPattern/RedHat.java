package com.design.decoratorPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:23
 */
public class RedHat extends Finery{
    public RedHat(Person person) {
        super(person);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("RedHat");
    }
}
