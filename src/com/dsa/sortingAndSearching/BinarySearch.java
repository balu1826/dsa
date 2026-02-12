package com.dsa.sortingAndSearching;
//Binary Search Problem on leetcode:153
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80,90};
		int k=890;
		System.out.println(binarySearch(arr,k));
	}
	
	public static int binarySearch(int arr[],int k) {
		int left=0;
		int right=arr.length-1;
		
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==k) {
				return mid;
			}
			else if(arr[mid]>k) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}

}
