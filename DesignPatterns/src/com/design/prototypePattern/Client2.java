package com.design.prototypePattern;

/**
 * @Author: chailei
 * @Date: 2021-12-08 下午 3:32
 */
public class Client2 {

    //深克隆
    public static void main(String[] args) {
        WeeklyLog2 log_1, log_2 = null;
        log_1 = new WeeklyLog2();    //创建原型对象
        Attchment attchment = new Attchment(); //创建附件对象
        log_1.setAttchment(attchment);    //将附件添加到周报种去
        log_1.setName("张三");
        log_1.setContent(10);
        //log_1.setDate("lucy");
        //log_1.setId(1024);
        try {
            log_2 = log_1.deepclone();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }    //克隆周报
        System.out.println("克隆对象是否相同：\t" + (log_1 == log_2));
        System.out.println("对象类型属性是否相同：\t" + (log_1.getAttchment() == log_2.getAttchment()));
        System.out.println("引用数据类型是否相同：\t" + (log_1.getName() == log_2.getName()));
        System.out.println("基本数据类型是否相同：\t" + (log_1.getContent() == log_2.getContent()));
        System.out.println("未赋值引用数据类型是否相同：\t" + (log_1.getDate() == log_2.getDate()));
        System.out.println("未赋值基本数据类型是否相同：\t" + (log_1.getId() == log_2.getId()));

        //克隆对象是否相同：	false
        //对象类型属性是否相同：	false
        //引用数据类型是否相同：	false
        //基本数据类型是否相同：	true
        //未赋值引用数据类型是否相同：	true
        //未赋值基本数据类型是否相同：	true
    }
}
