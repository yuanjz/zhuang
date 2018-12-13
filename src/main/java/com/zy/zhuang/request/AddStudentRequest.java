package com.zy.zhuang.request;

import java.io.Serializable;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 17:18
 * @Description:
 */
public class AddStudentRequest implements Serializable {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
