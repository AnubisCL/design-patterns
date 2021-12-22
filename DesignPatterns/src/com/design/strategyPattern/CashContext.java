package com.design.strategyPattern;

/**
 * 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，
 * 此模式让算法的变化，不会影响到使用算法的客户。
 * @Author: chailei
 * @Date: 2021-12-07 下午 2:47
 */
public class CashContext {

    //策略模式与简单工厂模式结合
    public static void main(String[] args) {
        double total = 0.0d;
        CashContext context = new CashContext("满300返100");
        total = context.getResult(350d);
        System.out.println(total);
        System.out.println();
    }
    /*
    * 对比：简单工厂模式 与 简单工厂模式结合策略者模式
    * 简单工厂模式的主方法需要 new Operation 与 OperationFactory 两个类
    * 而简单工厂模式结合策略者模式 则只需要 new 一个 CashContext 耦合性更低
    * 优点：1.策略模式封装了变化
    * */

    private CashSuper cashSuper;

    //单纯的策略模式
    /*public CashContext(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }*/

    //策略模式与简单工厂模式结合：（改进-使用反射，简化switch判断）
    public CashContext(String type){
        switch (type){
            case "打8折":
                cashSuper = new CashFold("0.8");
                break;

            case "满300返100":
                cashSuper = new CashReturn("300","100");
                break;
            default:
                cashSuper = new CashNormal();
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
