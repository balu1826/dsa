package com.dsa.fundamentals;

import java.util.Stack;

public class Problem13PostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="( A + B ) * ( C - D / E )";
		System.out.println(myApproach(exp));
	}
	public static String myApproach(String exp) {
		Stack<Character> ops=new Stack<>();
		String res="";
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(ch=='(') {
				ops.push(ch);
			}
			else if(Character.isLetterOrDigit(ch)) {
				//System.out.print(ch);
				res+=ch;
			}
			else if(ch==')'){
				while(ops.size()>0&&ops.peek()!='(') {
					//System.out.print(ops.pop());
					res+=ops.pop();
				}
				ops.pop();
			}
			else if(ch==' ') {
				continue;
			}
			else {
				while(ops.size()>0&&ops.peek()!='('&&precedence(ops.peek())>=precedence(ch)) {
					//System.out.print(ops.pop());
					res+=ops.pop();
				}
				ops.push(ch);
			}
		}
		while(ops.size()>0) {
			//System.out.print(ops.pop());
			res+=ops.pop();
		
		}
		return res;
		
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
