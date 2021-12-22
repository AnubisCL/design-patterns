package com.design.builderPattern.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体产品类
 * @Author: chailei
 * @Date: 2021-12-09 下午 3:16
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    public void addPart(String part){
        parts.add(part);
    }

    public void showDetail(){
        System.out.println("全部产品：");
        for (String part : parts) {
            System.out.print(part + "\t");
        }
        System.out.println("\n");
    }
}
