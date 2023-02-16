package org.zhangyu.sentinel.domain;

import java.io.Serializable;

/**
 * @author zhangyu
 * @date 2023/2/16 11:05
 */
public class User implements Serializable {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
