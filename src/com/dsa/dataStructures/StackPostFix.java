package com.dsa.dataStructures;

import java.util.Stack;

public class StackPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="( A + B ) * ( C - D / E )";
		myApproach(exp);
	}
	public static void myApproach(String exp) {
		Stack<Character> ops=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(ch=='(') {
				ops.push(ch);
			}
			else if(Character.isLetterOrDigit(ch)) {
				System.out.print(ch);
			}
			else if(ch==')'){
				while(ops.size()>0&&ops.peek()!='(') {
					System.out.print(ops.pop());
				}
				ops.pop();
			}
			else if(ch==' ') {
				continue;
			}
			else {
				while(ops.size()>0&&ops.peek()!='('&&precedence(ops.peek())>=precedence(ch)) {
					System.out.print(ops.pop());
				}
				ops.push(ch);
			}
		}
		while(ops.size()>0) {
			System.out.print(ops.pop());
		
		}
		
	}
	public static int precedence(char ch) {
		if(ch=='+'||ch=='-') {
			return 1;
		}
		else if(ch=='*'||ch=='/') {
			return 2;
		}
		else {
			return 0;
		}
	}

}
