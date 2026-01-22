package com.dsa.fundamentals;

public class Problem10_LargestAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,5,4,5,1,6};
		myApproach(arr);
		optimzedApproach(arr);

	}
	public static void myApproach(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			int left_count=left(arr,i);
			int right_count=right(arr,i);
			int current=arr[i]*left_count+arr[i]*right_count+arr[i];
			max=Math.max(max, current);
		}
		System.out.println("The maximum rectangle area is:"+max);
	}
	public static int left(int arr[],int ind) {
		int count=0;
		for(int i=ind-1;i>=0;i--) {
			if(arr[ind]<=arr[i]) {
				count++;
			}
			return count;
		}
		return count;
	}
	public static int right(int arr[],int ind) {
		int count=0;
		for(int i=ind+1;i<arr.length;i++) {
			if(arr[ind]<=arr[i]) {
				count++;
			}
			return count;
		}
		return count;
	}
	public static void optimzedApproach(int arr[]) {
		//use the Next greater element stack method for right side count and span of stack for left side count and follow the above same approach
	}

}
