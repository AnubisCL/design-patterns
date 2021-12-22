package com.design.builderPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-09 下午 2:51
 */
public class FatPersonBuilder extends PersonBuilder{


    @Override
    public void buildHead() {
        System.out.println("Fat Person Head");
    }

    @Override
    public void buildBody() {
        System.out.println("Fat Person Body");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("Fat Person Left Arm");
    }

    @Override
    public void buildRightArm() {
        System.out.println("Fat Person Right Arm");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("Fat Person Left Leg");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("Fat Person Right Leg");
    }
}
