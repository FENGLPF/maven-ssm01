package com.ssm.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer user_id;

    private String user_name;

    private String user_password;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }
}