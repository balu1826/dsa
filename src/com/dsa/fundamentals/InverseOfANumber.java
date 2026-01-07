package com.dsa.fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;

//Inversion of a number is nothing but interchanging the face value with it's index number of digit
//15432 to 43215
public class InverseOfANumber {
	public static void main(String[] args) {
		int n=426135;
		String num=String.valueOf(n);
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		int pos=1;
		
		for(int i=num.length()-1;i>=0;i--) {
			String s=String.valueOf(num.charAt(i));
			map.put(pos,s);
			pos++;
		}
		StringBuilder res=new StringBuilder(num);
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			//res.replace(Integer.valueOf(entry.getValue()),String.valueOf(entry.getKey()));
			res.setCharAt(Integer.valueOf(entry.getValue())-1,String.valueOf(entry.getKey()).charAt(0));
		}
		System.out.println(res.reverse());

	}
}
