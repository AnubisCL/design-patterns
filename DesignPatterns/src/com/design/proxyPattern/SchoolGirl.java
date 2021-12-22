package com.design.proxyPattern;

/**
 * main
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:53
 */
public class SchoolGirl {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("Lucy");
        //代理
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveFlower();
        proxy.givePhone();
    }

    /**
     * 代理模式：为其它对象提供一种代理以控制对这个对象的访问。
     * 1.远程代理：也就是为一个对象在不同的地址空间提供局部的代表。
     * 这样可以隐藏一个对象存在于不同的地址空间的事实。
     *
     * 2.虚拟代理：是根据需要创建开销很大的对象。通过他来存放实例化需要很长时间的真实对象。
     *
     * 3.安全代理：用来控制真是对象访问时的权限。
     *
     * 4.智能指引：是指当调用真实的对象时，代理处理另外一些事。
     */

    private String name;

    public SchoolGirl(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
