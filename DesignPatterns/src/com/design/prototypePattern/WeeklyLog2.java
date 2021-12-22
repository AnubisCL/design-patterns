package com.design.prototypePattern;

import java.io.*;

/**
 * 周报类
 *
 * 深克隆 ：克隆对象与克隆对象的子属性都要序列化
 *
 * @Author: chailei
 * @Date: 2021-12-08 下午 3:28
 */
public class WeeklyLog2 implements Serializable{

    public static final long serialVersionUID = 666L;

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

    //通过序列化进行深克隆
    public WeeklyLog2 deepclone() throws Exception {
        //将对象写入流中,
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象取出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (WeeklyLog2) ois.readObject();
    }

}
