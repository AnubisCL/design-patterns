package com.design.builderPattern.base;

/**
 * 抽象建造者类 确定 产品由 部件A 与 部件B 构成
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:23
 */
abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResPart();

}
