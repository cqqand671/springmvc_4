package com.accp.t4.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.t4.pojo.Chengjibiao;

public interface ChengjibiaoMapper {
    int addinsert(@Param("Chengjibiao1") List<Chengjibiao> chengjibiao);
}