package com.dsa.sortingAndSearching;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,6,23,44,22,76,43,11,55,98};
		mergeSort(arr,0,arr.length-1);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}
	public static void mergeSort(int arr[],int left,int right) {
		if(left>=right) {
			return;
		}
		int mid=left+(right-left)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	public static void merge(int arr[],int left,int mid,int right) {
		int l[]=new int[mid-left+1];
		int r[]=new int[right-mid];
		for(int i=0;i<l.length;i++) {
			l[i]=arr[left+i];
		}
		for(int i=0;i<r.length;i++) {
			r[i]=arr[mid+i+1];
		}
	
		
		int i=0,j=0,ind=left;
		while(i<l.length&&j<r.length) {
			if(l[i]>r[j]) {
				arr[ind++]=r[j++];
			}
			else if(l[i]<r[j]) {
				arr[ind++]=l[i++];
			}
			else if(l[i]==r[j]) {
				arr[ind++]=l[i++];
				arr[ind++]=r[j++];
			}
		}
		while(i<l.length) {
			arr[ind++]=l[i++];
		}
		while(j<r.length) {
			arr[ind++]=r[j++];
		}
		
		
	}

}
