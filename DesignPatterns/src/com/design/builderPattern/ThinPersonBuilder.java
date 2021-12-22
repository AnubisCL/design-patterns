package com.design.builderPattern;

/**
 * ConcreteBuilder 具体建造者
 * @Author: chailei
 * @Date: 2021-12-09 下午 2:51
 */
public class ThinPersonBuilder extends PersonBuilder{


    @Override
    public void buildHead() {
        System.out.println("Thin Person Head");
    }

    @Override
    public void buildBody() {
        System.out.println("Thin Person Body");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("Thin Person Left Arm");
    }

    @Override
    public void buildRightArm() {
        System.out.println("Thin Person Right Arm");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("Thin Person Left Leg");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("Thin Person Right Leg");
    }
}
