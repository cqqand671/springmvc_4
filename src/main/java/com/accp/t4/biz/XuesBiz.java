package com.accp.t4.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.t4.dao.ChengjibiaoMapper;
import com.accp.t4.dao.KechengMapper;
import com.accp.t4.dao.XuesMapper;
import com.accp.t4.dao.ZhuanyeMapper;
import com.accp.t4.pojo.Chengjibiao;
import com.accp.t4.pojo.Kecheng;
import com.accp.t4.pojo.Xues;
import com.accp.t4.pojo.Zhuanye;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class XuesBiz {
	@Autowired
	private XuesMapper xuesMapper;

	@Autowired
	private ZhuanyeMapper zhuanyeMapper;

	@Autowired
	private KechengMapper kechengMapper;

	@Autowired
	private ChengjibiaoMapper chengjibiaoMapper;

	public List<Xues> selectXues() {
		return xuesMapper.selectXues();
	}

	public Zhuanye selectZhuanye(String id) {
		return zhuanyeMapper.selectZhuanye(id);
	}

	public List<Kecheng> selectKecheng(String id) {
		return kechengMapper.selectKecheng(id);
	}

	public int addinsert(List<Chengjibiao> chengjibiao) {
		return chengjibiaoMapper.addinsert(chengjibiao);
	}
}
