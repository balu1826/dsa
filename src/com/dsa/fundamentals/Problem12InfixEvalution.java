package com.dsa.fundamentals;

import java.util.Stack;

public class Problem12InfixEvalution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="7*(2+(3-1))";
		myApproach(exp);

	}
	public static void myApproach(String exp) {
		Stack<Integer> nums=new Stack<>();
		Stack<Character> ops=new Stack<>();
	for(int i=0;i<exp.length();i++) {
		char ch=exp.charAt(i);
		if(ch=='(') {
			System.out.println(ops.push(ch));
		}
		else if(Character.isDigit(ch)) {
			System.out.println(nums.push((int)ch -'0')+"->22");
		}
		else if(ch==')') {
			while(ops.peek()!='(') {
				int n1=nums.pop();
				int n2=nums.pop();
				char c=ops.peek();
				int res=operation(n2,n1,ops.pop());
				System.out.println(n2+""+c+n1+"="+nums.push(res)+"->30");
			}
			System.out.println("Pop:"+ops.pop());
		}
		else {
			while(!ops.isEmpty() && ops.peek() != '(' &&
                precedence(ops.peek()) >= precedence(ch)){
			int n1=nums.pop();
			int n2=nums.pop();
			char temp=ops.peek();
			int res=operation(n2,n1,ops.pop());
			System.out.println(n2+""+temp+n1+"="+nums.push(res)+"->41");	
		}	
			System.out.println(ops.push(ch));	
		}
	}
	while(ops.size()>0) {
		int n1=nums.pop();
		int n2=nums.pop();
		char c=ops.pop();
		int res=operation(n2,n1,c);
		System.out.println(n1+""+c+n2+"="+nums.push(res)+"->51");
	}
	System.out.println("The final answer is:"+nums.pop());
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
	
	public static int precedence(char ch) {
		if(ch=='+') {
			return 1;
		}
		else if(ch=='-')
			return 1;
		else if (ch=='*')
			return 2;
		else 
			return 0;
	}

}
