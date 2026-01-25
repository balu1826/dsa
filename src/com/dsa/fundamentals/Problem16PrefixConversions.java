package com.dsa.fundamentals;

import java.util.Stack;

public class Problem16PrefixConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="*-36+24";
		System.out.println(myApproach(exp));//1.From Prefix to compute the result
											//2.Follow the same pattern with String type stack to get Infix
											//3.Convert the resultant Infix to Postfix

	}
	public static int myApproach(String exp) {
		Stack<Integer> nums=new Stack<>();
		Stack<Character> ops=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(!Character.isLetterOrDigit(ch)&&Character.isLetterOrDigit(exp.charAt(i+1))) {
				int n1=(int)exp.charAt(i+1)-'0';
				int n2=(int)exp.charAt(i+2)-'0';
				nums.push(operation(n1,n2,ch));
				i=i+2;
			}
			else {
				ops.push(ch);
			}
		}
		while(ops.size()>0) {
			int n2=nums.pop();
			int n1=nums.pop();
			nums.push(operation(n1,n2,ops.pop()));
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

}
