package com.design.builderPattern.base;

/**
 * 指挥者
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:30
 */
public class Director {

    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

    public Director(){}

}
