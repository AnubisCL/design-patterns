package com.design.factoryPattern.function;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 2:15
 */
public class functionFactory {

    /**
     * 方法工厂
     * 注：使用发射解决客户端分支判断调用
     * @param args
     */
    public static void main(String[] args) {
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng student = undergraduateFactory.CreateLeiFeng();
        student.Sweep();
        student.Wash();
        student.BuyRice();

    }
}
