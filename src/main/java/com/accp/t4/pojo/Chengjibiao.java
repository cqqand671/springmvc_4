package com.accp.t4.pojo;

public class Chengjibiao {
	private String xuesid;

	private String kechengid;

	private String kschengji;

	private String kstiem;
	
	

	public Chengjibiao(String xuesid, String kechengid, String kschengji) {
		super();
		this.xuesid = xuesid;
		this.kechengid = kechengid;
		this.kschengji = kschengji;
	}

	@Override
	public String toString() {
		return "Chengjibiao [xuesid=" + xuesid + ", kechengid=" + kechengid + ", kschengji=" + kschengji + ", kstiem="
				+ kstiem + "]";
	}

	public String getXuesid() {
		return xuesid;
	}

	public void setXuesid(String xuesid) {
		this.xuesid = xuesid == null ? null : xuesid.trim();
	}

	public String getKechengid() {
		return kechengid;
	}

	public void setKechengid(String kechengid) {
		this.kechengid = kechengid == null ? null : kechengid.trim();
	}

	public String getKschengji() {
		return kschengji;
	}

	public void setKschengji(String kschengji) {
		this.kschengji = kschengji == null ? null : kschengji.trim();
	}

	public String getKstiem() {
		return kstiem;
	}

	public void setKstiem(String kstiem) {
		this.kstiem = kstiem == null ? null : kstiem.trim();
	}
}