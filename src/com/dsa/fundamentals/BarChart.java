package com.dsa.fundamentals;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,1,0,7,5};
		int max=0;
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		int a[][]=new int[max][arr.length];
		int pointer=0;
		for(int i=0;i<a[0].length;i++) {
			for(int j=a.length-1;j>=a.length-arr[pointer];j--) {
				a[j][i]=1;
			}
			System.out.println();
			pointer++;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
