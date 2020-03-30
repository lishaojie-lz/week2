package com.lishaojie.common.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		//循环10000次
		for (int i = 0; i < 10000; i++) {
			String name = StringUtil.generateChineseName();
			int age = RandomUtil.random(1, 120);
			String about = StringUtil.randomChineseString(140);
			//随机生成时间
			Date date = new Date();
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
			String created = sFormat.format(date);
			System.out.println(new Person(name, age, about, created));
		}	
	}

}
