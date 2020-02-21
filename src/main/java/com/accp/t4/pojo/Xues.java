package com.accp.t4.pojo;

public class Xues {
    private String xuid;

    private String xuname;

    private String banji;

    private String zhuanyeid;

    public String getXuid() {
        return xuid;
    }

    public void setXuid(String xuid) {
        this.xuid = xuid == null ? null : xuid.trim();
    }

    public String getXuname() {
        return xuname;
    }

    public void setXuname(String xuname) {
        this.xuname = xuname == null ? null : xuname.trim();
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }

    public String getZhuanyeid() {
        return zhuanyeid;
    }

    public void setZhuanyeid(String zhuanyeid) {
        this.zhuanyeid = zhuanyeid == null ? null : zhuanyeid.trim();
    }
}