package com.design.builderPattern.base;

/**
 * 具体建造者
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:27
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("A部件");
    }

    @Override
    public void buildPartB() {
        product.addPart("B部件");
    }

    @Override
    public Product getResPart() {
        return product;
    }
}
