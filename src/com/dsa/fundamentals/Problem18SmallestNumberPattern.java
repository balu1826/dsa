package com.dsa.fundamentals;

import java.util.Stack;

public class Problem18SmallestNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="iddd";
		myApproach(exp);
	}
	public static void myApproach(String exp) {
		int count=1;
		Stack<Integer> nums=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(ch=='d') {
				nums.push(count);
				count++;
			}
			else {
				nums.push(count);
				count++;
				while(nums.size()>0) {
					System.out.print(nums.pop());
				}
			}
		}
		nums.push(count);
		while(nums.size()>0) {
			System.out.print(nums.pop());
		}
		
		
	
		
	}
	
}
