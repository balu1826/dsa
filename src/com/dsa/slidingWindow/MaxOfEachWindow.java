package com.dsa.slidingWindow;

public class MaxOfEachWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,28,3,3,2,21,23,123,1234,123,54,78};
		int k=4;
		myApproach(arr,k);
		

	}
	public static void myApproach(int arr[],int k) {
		int max=Integer.MIN_VALUE;
		int step=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(step==k) {
				System.out.print(max+" ");
				step=0;
				max=Integer.MIN_VALUE;
			}
			step++;
		}
	}

}
