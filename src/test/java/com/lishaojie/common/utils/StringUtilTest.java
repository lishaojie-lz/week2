package com.lishaojie.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String s="";
		if(StringUtil.hasLength(s)){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		
	}

	@Test
	public void testHasText() {
		String s="";
		if(StringUtil.hasLength(s)){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(3);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
