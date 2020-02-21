package com.accp.t4.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.biz.XuesBiz;
import com.accp.t4.pojo.Chengjibiao;
import com.accp.t4.pojo.Kecheng;
import com.accp.t4.pojo.Xues;
import com.accp.t4.pojo.Zhuanye;

@RestController
@RequestMapping("/tydaction")
public class TyDAction {

	@Autowired
	private XuesBiz xuesBiz;

	@GetMapping("xs")
	public List<Xues> getPersonList() {
		return xuesBiz.selectXues();
	}

	@GetMapping("zy/{id}")
	public Zhuanye getZhuanye(@PathVariable String id) {
		return xuesBiz.selectZhuanye(id);
	}

	@GetMapping("kc/ccc/{id}")
	public List<Kecheng> selectKecheng(@PathVariable String id) {
		System.out.println(xuesBiz.selectKecheng(id));
		return xuesBiz.selectKecheng(id);
	}

	@PostMapping("add")
	public int add(@RequestBody List<Chengjibiao> list) {
		return xuesBiz.addinsert(list);
	}

}
