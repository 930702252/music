package com.lanqiao.model;

public class Album {
    private Integer aid;

    private String aname;

    private String aimg;

    private Integer mid;

    private String adetail;

    private String areserve2;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg == null ? null : aimg.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getAdetail() {
        return adetail;
    }

    public void setAdetail(String adetail) {
        this.adetail = adetail == null ? null : adetail.trim();
    }

    public String getAreserve2() {
        return areserve2;
    }

    public void setAreserve2(String areserve2) {
        this.areserve2 = areserve2 == null ? null : areserve2.trim();
    }
}