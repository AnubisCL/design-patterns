package com.design.strategyPattern;

/**
 * @Author: chailei
 * @Date: 2021-12-07 下午 2:42
 */
public class CashSuperImpl {
}
// 正常
class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
// 打折
class CashFold implements CashSuper{

    private double fold = 1d;

    public CashFold(String fold){
        this.fold = Double.parseDouble(fold);
    }

    @Override
    public double acceptCash(double money) {
        return money * fold;
    }
}

// 满减
class CashReturn implements CashSuper{

    private double conditionMoney;
    private double returnMoney;

    public  CashReturn(String conditionMoney,String returnMoney){
        this.conditionMoney = Double.parseDouble(conditionMoney);
        this.returnMoney = Double.parseDouble(returnMoney);
    }

    @Override
    public double acceptCash(double money) {
        double resMonye = money;
        if (money >= conditionMoney){
            resMonye = money - Math.floor(money / conditionMoney) * returnMoney;
        }
        return resMonye;
    }
}
