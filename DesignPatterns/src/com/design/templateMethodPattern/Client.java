package com.design.templateMethodPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 5:16
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass ac;

        ac = new ConcreteClassA();
        ac.templateMethods();

        ac = new ConcreteClassB();
        ac.templateMethods();
    }
    /**
     * 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势。
     *
     */
}
