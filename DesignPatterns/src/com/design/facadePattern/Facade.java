package com.design.facadePattern;

/**
 * 外观模式 建造者模式
 * @Author: chailei
 * @Date: 2021-12-09 下午 2:17
 */
public class Facade {

    /**
     * 外观模式：位子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
     * 这个接口使得这一子系统更加容易使用。
     * @param args
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodsByA();
        facade.methodsByB();
    }

    SubSystemA systemA;
    SubSystemB systemB;
    SubSystemC systemC;
    SubSystemD systemD;

    public Facade() {
        systemA = new SubSystemA();
        systemB = new SubSystemB();
        systemC = new SubSystemC();
        systemD = new SubSystemD();
    }

    public void methodsByA(){
        System.out.println("\nmethods group A:");
        systemA.MethodA();
        systemB.MethodB();
        systemD.MethodD();
        System.out.println("\n");
    }

    public void methodsByB(){
        System.out.println("\nmethods group B:");
        systemA.MethodA();
        systemC.MethodC();
        systemD.MethodD();
        System.out.println("\n");
    }

}
