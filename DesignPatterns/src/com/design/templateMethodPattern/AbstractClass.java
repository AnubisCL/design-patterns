package com.design.templateMethodPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 4:59
 */
abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethods() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }

    /**
     * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
     * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
     */
}
