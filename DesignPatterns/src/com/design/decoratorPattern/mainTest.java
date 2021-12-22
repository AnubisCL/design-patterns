package com.design.decoratorPattern;

/**
 * 装饰模式
 * @Author: chailei
 * @Date: 2021-12-08 上午 10:24
 */
public class mainTest {

    public static void main(String[] args) {
        Person lucy = new Person("Lucy");
        Finery finery = new Finery(lucy);
        TShirts tShirts = new TShirts(finery);
        RedHat redHat = new RedHat(tShirts);
        redHat.show();
    }

    /**
     * 装饰模式是为已有功能动态地添加更多功能的一种方式。
     * 当系统需要新功能的时候，是向旧的类中添加新的代码。
     * 这些新加的代码通常装饰类原有类的核心职责或主要行为。
     * 优点：
     * 1.把类中的装饰功能从类中搬移去除，这样可以简化原有的类。
     * 2.有效的把类的核心职责与装饰功能区分开
     */
}
