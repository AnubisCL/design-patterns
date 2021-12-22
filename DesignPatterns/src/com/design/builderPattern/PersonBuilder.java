package com.design.builderPattern;

/**
 * Product 具体产品
 * @Author: chailei
 * @Date: 2021-12-09 下午 2:43
 */
abstract class PersonBuilder {

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildLeftArm();
    public abstract void buildRightArm();
    public abstract void buildLeftLeg();
    public abstract void buildRightLeg();

}
