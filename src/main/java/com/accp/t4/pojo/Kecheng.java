package com.accp.t4.pojo;

public class Kecheng {
    private String keid;

    private String kename;

    private String zhuid;

    public String getKeid() {
        return keid;
    }

    public void setKeid(String keid) {
        this.keid = keid == null ? null : keid.trim();
    }

    public String getKename() {
        return kename;
    }

    public void setKename(String kename) {
        this.kename = kename == null ? null : kename.trim();
    }

    public String getZhuid() {
        return zhuid;
    }

    public void setZhuid(String zhuid) {
        this.zhuid = zhuid == null ? null : zhuid.trim();
    }
}