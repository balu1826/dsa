package com.dsa.fundamentals;

import java.util.Stack;

public class Problem15PostfixConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="36-24+*";
		System.out.println(myApproach(exp));//To compute the expression from Postfix
		System.out.println(myApproachFromPostfixToInfix(exp));//To convert Postfix to Infix
	}
	public static int myApproach(String exp) {
		Stack<Integer> nums=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				nums.push((int)ch-'0');
			}
			else {
				int n2=nums.pop();
				int n1=nums.pop();
				nums.push(operation(n1,n2,ch));
			}
		}
		return nums.pop();
		
	}
	public static int operation(int n1,int n2,char ch) {
		switch(ch) {
		case '+':
			return n1+n2;
		case '-':
			return n1-n2;
		case '*':
			return n1*n2;
		case '/':
			return n1/n2;
		default:
			return 0;
		}
	}
	
	public static String myApproachFromPostfixToInfix(String exp) {
		Stack<String> expression=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				expression.push(String.valueOf(ch));
			}
			else {
				String temp=String.valueOf(ch)+expression.pop()+")";
				temp="("+expression.pop()+temp;
				expression.push(temp);
			}
		}
		return expression.pop();
		
		
	}

}
