package com.dsa.fundamentals;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,3,45,32,54,76,65,32};
		myApproach(arr);

	}
	public static void myApproach(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Next greater element for "+arr[i]+" is:"+helper(arr,i));
		}
	}
	public static int helper(int arr[],int ind) {
		for(int i=ind+1;i<arr.length;i++) {
			if(arr[i]>arr[ind])
				return arr[i];
		}
		return -1;
	}

}
