package com.dsa.fundamentals;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int stars=1;
		int spaces=n/2;
		boolean b=true;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("* ");
			}
			System.out.println();
			b=i<=n/2?true:false;
			stars=(stars<n&&b)?stars+=2:(stars=stars-2);
			spaces=(spaces<=n&&b)?(spaces-=1):(spaces+=1);
		}
	}

}
