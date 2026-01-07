package com.dsa.fundamentals;

public class Benjiman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		boolean arr[]=new boolean[n+1];
		
		for(int j=1;j<n+1;j++) {
			for(int i=j;i<n+1;i=i+j) {
				if(arr[i]==true) {
					arr[i]=false;
				}
				else {
					arr[i]=true;
				}
				
			}
		}
		
		for(int i=1;i<n+1;i++) {
			if(arr[i]==true) {
				System.out.println(i-1+" "+n);
			}
		}
		
	}

}
