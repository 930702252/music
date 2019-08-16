package com.lanqiao.model;

public class User {
    private Integer uid;

    private String username;

    private String password;

    private String email;

    private String ureserve1;

    private String ureserve2;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUreserve1() {
        return ureserve1;
    }

    public void setUreserve1(String ureserve1) {
        this.ureserve1 = ureserve1 == null ? null : ureserve1.trim();
    }

    public String getUreserve2() {
        return ureserve2;
    }

    public void setUreserve2(String ureserve2) {
        this.ureserve2 = ureserve2 == null ? null : ureserve2.trim();
    }
}