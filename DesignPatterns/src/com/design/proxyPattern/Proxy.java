package com.design.proxyPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:55
 */
public class Proxy implements GiveGift{

    private Pursuit pursuit;

    public Proxy(SchoolGirl mm){
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }

    @Override
    public void givePhone() {
        pursuit.givePhone();
    }
}
