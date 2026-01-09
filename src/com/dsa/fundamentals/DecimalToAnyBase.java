package com.dsa.fundamentals;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=57;
		int base=8;
		switch(base) {
		case 2:
			System.out.println(toBinary(n));
			break;
		case 8:
			System.out.println(toOctal(n));
		}
		
		

	}
	public static int toBinary(int num) {
		String res=new String();
		while(num>0) {
			int rem=num%2;
			num/=2;
			res= String.valueOf(rem)+res;
		}
	
		return Integer.valueOf(res);
	}
	public static int toOctal(int num) {
		String res=new String();
		while(num>0) {
			int rem=num%8;
			num/=8;
			res=String.valueOf(rem)+res;
		}
		return Integer.valueOf(res);
	}

}
