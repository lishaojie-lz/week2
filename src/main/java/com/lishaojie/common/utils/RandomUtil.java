package com.lishaojie.common.utils;

import java.util.HashSet;
import java.util.Random;


public class RandomUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: ���ֵ����
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random random = new Random();
		int s = random.nextInt(max-min+1)+min;
		
		
		return s;
	//TODO ʵ�ִ���
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		int []s =  new int[subs];
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size()!=subs) {
			set.add(random(min, max));
		}
		int i=0;
		for (Integer integer : set) {
			s[i]=integer;
			i++;
		}
		
		return s;
	//TODO ʵ�ִ���
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		int s = random.nextInt(str.length()-1+1)+1;
		char sub = str.charAt(s);
		
		return sub;
	//TODO ʵ�ִ���
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String st="";
		for (int i = 0; i < length; i++) {
			char s = randomCharacter();
			st+=s;
			
		}
		return st;
	//TODO ʵ�ִ���
	}
}
