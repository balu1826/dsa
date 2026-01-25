package com.dsa.fundamentals;

public class Problem14PreFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="( A + B ) * ( C - D / E )";
		//1.Reverse the exp by swapping the parenthesis
		exp=reverse(exp);
		//2.Find out it's postfix
		exp=Problem13PostFix.myApproach(exp);
		//3.Reverse this Postfix
		System.out.println(reverse(exp));
		

	}
	public static String reverse(String exp) {
		String res="";
		for(int i=exp.length()-1;i>=0;i--) {
			if(exp.charAt(i)=='(') {
				res=res+')';
			}
			else if(exp.charAt(i)==')') {
				res=res+'(';
			}
			else {
				res=res+exp.charAt(i);
			}
		}
		return res;
	}

}
