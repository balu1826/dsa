package com.dsa.slidingWindow;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 12, -5, -6, 50, 3};
		int k=4;
		System.out.println(myApproach(arr,k));

	}
	public static int myApproach(int arr[],int k) {
		int current_sum=0;
		for(int i=0;i<k;i++) {
			current_sum+=arr[i];
		}
		int max_sum=current_sum;
		for(int i=k;i<arr.length;i++) {
			current_sum+=arr[i]-arr[i-k];
			max_sum=Math.max(max_sum, current_sum);
		}
		
		return max_sum;
	}

}
