package com.zy.zhuang.request;

import java.io.Serializable;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/12/13 15:39
 * @Description:
 */
public class IdRequest implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
