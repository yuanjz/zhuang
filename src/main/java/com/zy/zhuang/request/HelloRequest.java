package com.zy.zhuang.request;

import java.io.Serializable;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/11/29 11:29
 * @Description:
 */
public class HelloRequest implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
