package com.design.builderPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:01
 */
public class Cilent {

    public static void main(String[] args) {
        ThinPersonBuilder thinPerson = new ThinPersonBuilder();
        FatPersonBuilder fatPerson = new FatPersonBuilder();

        PersonDirector personDirector1 = new PersonDirector(thinPerson);
        personDirector1.createPerson();

        System.out.println("\n");

        PersonDirector personDirector2 = new PersonDirector(fatPerson);
        personDirector2.createPerson();

    }

    /**
     * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
     *
     */
}
