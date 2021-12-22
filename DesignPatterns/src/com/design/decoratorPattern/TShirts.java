package com.design.decoratorPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:20
 */
public class TShirts extends Finery{

    public TShirts(Person person) {
        super(person);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("T-Shirts");
    }
}
