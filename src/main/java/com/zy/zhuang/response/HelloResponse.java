package com.zy.zhuang.response;

import java.io.Serializable;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/11/29 11:30
 * @Description:
 */
public class HelloResponse implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
