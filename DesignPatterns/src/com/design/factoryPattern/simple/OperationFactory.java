package com.design.factoryPattern.simple;

/**
 * 1.简单工厂模式
 * @Author: chailei
 * @Date: 2021-12-07 上午 10:53
 */
public class OperationFactory {

    public static void main(String[] args) {
        Operation<Long> oper;
        OperationFactory operationFactory = new OperationFactory();
        oper = operationFactory.createOperation("+");
        try {
            System.out.println(oper.getResult(123L,123L));
        } catch (Exception e) {
            System.out.println("参数传入出错");
            e.printStackTrace();
        }
    }

    public static <T extends Number> Operation createOperation(String operate){
        Operation<T> oper = null;

        switch (operate){
            case "+":
                oper = new addOperator<T>();
                break;
            case "-":
                oper = new subOperator<T>();
                break;
            case "*":
                oper = new mulOperator<T>();
                break;
            case "/":
                oper = new divOperator<T>();
                break;
        }
        return oper;
    }
}
