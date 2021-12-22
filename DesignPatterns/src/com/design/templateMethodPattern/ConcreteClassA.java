package com.design.templateMethodPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 5:15
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
