package com.design.builderPattern;

/**
 * Director 指挥者
 * @Author: chailei
 * @Date: 2021-12-09 下午 2:56
 */
public class PersonDirector {

    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void createPerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildLeftArm();
        pb.buildRightArm();
        pb.buildLeftLeg();
        pb.buildRightLeg();
    }
}
