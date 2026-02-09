package com.dsa.sortingAndSearching;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {4,8,9,10,26,34};
		int arr2[]= {1,6,8,9,12,16,19,26,29};
		int res[]=merge(arr1,arr2);
		for(int num:res) {
			System.out.print(num+" ");
		}

	}
	public static int[] merge(int arr1[],int arr2[]) {
		int res[]=new int[arr1.length+arr2.length];
		int i=0,j=0,ind=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				res[ind++]=arr2[j++];
				
			}
			else if(arr1[i]<arr2[j]) {
				res[ind++]=arr1[i++];
			}
			else if(arr1[i]==arr2[j]) {
				res[ind++]=arr1[i++];
				res[ind++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			res[ind++]=arr1[i++];
		}
		while(j<arr2.length) {
			res[ind++]=arr2[j++];
		}
		return res;
	}

}
