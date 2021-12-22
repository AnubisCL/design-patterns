package com.design.prototypePattern;


import java.io.Serializable;

/**
 * 附件类
 *
 * @Author: chailei
 * @Date: 2021-12-08 下午 2:24
 */
public class Attchment implements Serializable {

    public static final long serialVersionUID = 777L;

    public String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件：" + name);
    }
}
