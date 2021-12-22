package com.design.factoryPattern.function;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 2:11
 */
public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}
