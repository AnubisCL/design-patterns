package com.design.factoryPattern.simple;

/**
 * @Author: chailei
 * @Date: 2021-12-07 上午 10:44
 */
public interface Operation<T extends Number>{

    T getResult(T num1,T num2) throws Exception;

}
