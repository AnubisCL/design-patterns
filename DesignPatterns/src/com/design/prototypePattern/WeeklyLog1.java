package com.design.prototypePattern;

import com.sun.xml.internal.ws.api.message.Attachment;

/**
 * 周报类
 *
 * @Author: chailei
 * @Date: 2021-12-08 下午 3:28
 */
public class WeeklyLog1 implements Cloneable {

    /*
    * implements Cloneable 接口：
    * 不支持克隆方法！
      周报是否相同false
      Exception in thread "main" java.lang.NullPointerException
            at com.design.prototypePattern.Client.main(Client.java:19)
    * */
    private Attchment attchment;
    private String date;
    private String name;
    private int content;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Attchment getAttchment() {
        return attchment;
    }

    public void setAttchment(Attchment attchment) {
        this.attchment = attchment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    //实现clone()方法实现浅克隆
    public WeeklyLog1 clone() {
        //需要实现cloneable的接口，直接继承object就好，它里面自带一个clone方法！
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog1) obj;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            System.out.println("不支持克隆方法！");
            return null;
        }


    }
}
