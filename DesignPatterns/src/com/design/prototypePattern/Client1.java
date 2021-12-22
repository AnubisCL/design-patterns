package com.design.prototypePattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 3:32
 */
public class Client1 {

    /**
     * 基本数据类型 在 浅克隆 时会被复制
     * 引用数据类型 不会被复制
     * @param args
     */
    //浅克隆（深克隆需要序列化）
    public static void main(String[] args) {
        WeeklyLog1 log_1, log_2;
        log_1 = new WeeklyLog1();
        Attchment attchment = new Attchment(); //创建附件对象
        log_1.setAttchment(attchment);    //将附件添加到周报种去
        log_1.setName("张三");
        log_1.setContent(10);
        //log_1.setDate("lucy");
        //log_1.setId(1024);
        log_2 = log_1.clone();    //克隆周报
        System.out.println("克隆对象是否相同：\t" + (log_1 == log_2));
        System.out.println("对象类型属性是否相同：\t" + (log_1.getAttchment() == log_2.getAttchment()));
        System.out.println("引用数据类型是否相同：\t" + (log_1.getName() == log_2.getName()));
        System.out.println("基本数据类型是否相同：\t" + (log_1.getContent() == log_2.getContent()));
        System.out.println("未赋值引用数据类型是否相同：\t" + (log_1.getDate() == log_2.getDate()));
        System.out.println("未赋值基本数据类型是否相同：\t" + (log_1.getId() == log_2.getId()));
        //克隆对象是否相同：	false
        //对象类型属性是否相同：	true
        //引用数据类型是否相同：	true
        //基本数据类型是否相同：	true
        //未赋值引用数据类型是否相同：	true
        //未赋值基本数据类型是否相同：	true
    }

    /**
     * 原型模式的优缺点
     * 优点:
     * 1.当创建的对象实例较为复杂的时候，使用原型模式可以简化对象的创建过程！
     * 2.扩展性好，由于写原型模式的时候使用了抽象原型类，在客户端进行编程的时候可以将具体的原型类通过配置进行读取。
     * 3.可以使用深度克隆来保存对象的状态，使用原型模式进行复制。当你需要恢复到某一时刻就直接跳到。比如我们的idea种就有历史版本，或则SVN中也有这样的操作。非常好用！
     *
     * 缺点:
     * 1.需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的里面，当对已有的类经行改造时需要修改源代码，违背了开闭原则。
     * 2.在实现深克隆的时需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用的时候，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现相对麻烦。
     */
}
