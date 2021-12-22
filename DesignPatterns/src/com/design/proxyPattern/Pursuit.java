package com.design.proxyPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:49
 */
public class Pursuit implements GiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveFlower() {
        System.out.println(mm.getName() + "被送花。");
    }

    @Override
    public void givePhone() {
        System.out.println(mm.getName() + "被送手机。");
    }
}
