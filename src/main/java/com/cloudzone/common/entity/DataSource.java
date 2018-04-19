package com.cloudzone.common.entity;

import java.util.Date;

public class DataSource {
    private Integer id;

    private String type;

    private String version;

    private String size;

    private Date uTime;

    private String sEnv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public String getsEnv() {
        return sEnv;
    }

    public void setsEnv(String sEnv) {
        this.sEnv = sEnv == null ? null : sEnv.trim();
    }
}