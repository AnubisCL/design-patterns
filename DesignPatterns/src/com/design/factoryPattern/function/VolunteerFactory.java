package com.design.factoryPattern.function;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 2:14
 */
public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
