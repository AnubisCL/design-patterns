package com.design.builderPattern.base;

/**
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:33
 */
public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResPart();
        p1.showDetail();

        director.Construct(b2);
        Product p2 = b2.getResPart();
        p2.showDetail();
    }

}
