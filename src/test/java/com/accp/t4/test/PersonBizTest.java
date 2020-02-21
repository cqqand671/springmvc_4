package com.accp.t4.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.t4.biz.PersonBiz;
import com.accp.t4.biz.XuesBiz;
import com.accp.t4.pojo.Address;
import com.accp.t4.pojo.Chengjibiao;
import com.accp.t4.pojo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class PersonBizTest {

	@Autowired
	private PersonBiz personBiz;

	@Autowired
	private XuesBiz xuesBiz;

	@Test
	public void testQuery() {
		try {

			List<Chengjibiao> list = new ArrayList<Chengjibiao>();
			Chengjibiao cc = new Chengjibiao("1", "2", "3");
			Chengjibiao cc2 = new Chengjibiao("1", "2", "3");

			list.add(cc);
			list.add(cc2);

			System.out.println("]]]]]]]]]]]]]]]]" + list);
			System.out.println("----" + xuesBiz.addinsert(list));

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
