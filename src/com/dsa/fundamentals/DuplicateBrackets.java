package com.dsa.fundamentals;

import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="((a+b)+(a+b))";
		System.out.println(myApproach(exp));
	}
	public static boolean myApproach(String exp) {
		Stack<Character> stack=new Stack<>();
		int ind=0;
		boolean b=true;
		char lastPop=' ';
		while(ind<exp.length()) {
			if(b&&exp.charAt(ind)!=')') {
				stack.push(exp.charAt(ind));
				//System.out.println("push:"+exp.charAt(ind));
				ind++;
			}
			else {
				b=false;
				if(stack.peek()=='(') {
					b=true;
					ind++;
				}
				if(lastPop=='('&&stack.peek()=='(')
					return true;
				lastPop=stack.peek();
				stack.pop();
				//System.out.println("pop:"+stack.pop());				
			}
		}
		return false;
	}

}
//Rules:
//Rule 1:Push all the characters into the stack until next character is closed parentheses
//Rule 2:Start popping all the characters if rule 1 is false(once you get the next character as closed one) until you pop the open one.
//Rule 3:Decision making rule:Return true(which means duplicate brackets)if you pop the open parentheses consecutively 2 times else return false.
