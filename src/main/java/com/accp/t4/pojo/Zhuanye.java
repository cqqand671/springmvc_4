package com.accp.t4.pojo;

public class Zhuanye {
    private String zhuid;

    private String zhuname;

    public String getZhuid() {
        return zhuid;
    }

    public void setZhuid(String zhuid) {
        this.zhuid = zhuid == null ? null : zhuid.trim();
    }

    public String getZhuname() {
        return zhuname;
    }

    public void setZhuname(String zhuname) {
        this.zhuname = zhuname == null ? null : zhuname.trim();
    }
}