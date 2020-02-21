package com.accp.t4.dao;

import java.util.List;

import com.accp.t4.pojo.Kecheng;

public interface KechengMapper {
	List<Kecheng> selectKecheng(String id);
}