package com.accp.t4.dao;

import java.util.List;

import com.accp.t4.pojo.Xues;
import com.accp.t4.pojo.Zhuanye;

public interface XuesMapper {
	int insert(Xues record);

	int insertSelective(Xues record);

	List<Xues> selectXues();
}