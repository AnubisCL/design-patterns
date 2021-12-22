package com.design.factoryPattern.simple;

import java.math.BigDecimal;

/**
 * @Author: chailei
 * @Date: 2021-12-07 上午 10:51
 */

/**
 * The abstract class Number is the superclass of platform classes representing numeric values that are convertible to the primitive types byte,
 * double, float, int, long, and short. The specific semantics of the conversion from the numeric value of a particular Number implementation
 * to a given primitive type is defined by the Number implementation in question.For platform classes, the conversion is often analogous to a
 * narrowing primitive conversion or a widening primitive conversion as defining in The Java™ Language Specification for converting between
 * primitive types. Therefore,conversions may lose information about the overall magnitude of a numeric value, may lose precision, and may
 * even return a result of a different sign than the input. See the documentation of a given Number implementation for conversion details.
 */

public class OperationImpl {
}
class addOperator<T extends Number> implements Operation<T> {
    @Override
    public T getResult(T a, T b) throws Exception{
        if(a instanceof Integer){
            return (T)Integer.valueOf(((Integer) a).intValue()+((Integer)b).intValue());
        }else if(a instanceof BigDecimal){
            return (T) ((BigDecimal) a).add((BigDecimal) b);
        }else if(a instanceof Long){
            return (T)Long.valueOf (((Long) a).longValue()+((Long) b).longValue());
        }else {
            throw new Exception("未实现该类型的加法"+a.getClass().getName());
        }
    }
}

class subOperator<T extends Number> implements Operation<T>{
    @Override
    public T getResult(T a, T b) throws Exception {
        if(a instanceof Integer){
            return (T)Integer.valueOf(((Integer) a).intValue()-((Integer)b).intValue());
        }else if(a instanceof BigDecimal){
            return (T) ((BigDecimal) a).subtract((BigDecimal) b);
        }else if(a instanceof Long){
            return (T)Long.valueOf (((Long) a).longValue()-((Long) b).longValue());
        }else {
            throw new Exception("未实现该类型的加法"+a.getClass().getName());
        }
    }
}

class mulOperator<T extends Number> implements Operation<T>{
    @Override
    public T getResult(T a, T b)  throws Exception {
        if(a instanceof Integer){
            return (T)Integer.valueOf(((Integer) a).intValue()*((Integer)b).intValue());
        }else if(a instanceof BigDecimal){
            return (T) ((BigDecimal) a).multiply((BigDecimal) b);
        }else if(a instanceof Long){
            return (T)Long.valueOf (((Long) a).longValue()*((Long) b).longValue());
        }else {
            throw new Exception("未实现该类型的加法"+a.getClass().getName());
        }
    }
}

class divOperator<T extends Number> implements Operation<T>{
    @Override
    public T getResult(T a, T b) throws Exception {
        if(a instanceof Integer){
            return (T)Integer.valueOf(((Integer) a).intValue()/((Integer)b).intValue());
        }else if(a instanceof BigDecimal){
            return (T) ((BigDecimal) a).divide((BigDecimal) b);
        }else if(a instanceof Long){
            return (T)Long.valueOf (((Long) a).longValue()/((Long) b).longValue());
        }else {
            throw new Exception("未实现该类型的加法"+a.getClass().getName());
        }
    }
}
