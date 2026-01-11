package com.dsa.fundamentals;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String exp="[(a+b)+{(c+d)*{(c+d)*(e/f)}]";
		//String exp="[(a+b)+{(c+d)*(e/f)]}";
		//String exp="[(a+b)+{(c+d)*(e/f)}";
		String exp="([(a+b)+{(c+d)*(e/f)}]";
				
		System.out.println(myApproach(exp));

	}
	public static boolean myApproach(String exp) {
		Stack<Character> stack=new Stack<>();
		String open="([{";
		String close=")]}";
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(close.indexOf(ch)==-1) {
				System.out.println("Push:"+stack.push(ch));
			}
			else {
				if(!stack.isEmpty())
					return false;
				int ind=close.indexOf(ch);
				while(open.indexOf(stack.peek())!=ind) {
					System.out.println("Pop:"+stack.pop());
				}
				System.out.println("Pop:"+stack.pop());
				
			}
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}

}
