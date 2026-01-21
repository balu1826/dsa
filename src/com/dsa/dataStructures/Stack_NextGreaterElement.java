package com.dsa.dataStructures;

import java.util.Stack;

public class Stack_NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,3,45,32,54,76,65,32};
		myApproach(arr);
		System.out.println();
		optimizedApproach(arr);

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
	public static void optimizedApproach(int arr[]) {
		Stack<Integer> stack=new Stack<>();
		int res[]=new int[arr.length];
		res[arr.length-1]=-1;
		int ind=arr.length-2;
		stack.push(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			//Pop all the items which are less than the current element
			if(stack.size()>0&&arr[i]>stack.peek()) {
				while(stack.size()>0&&arr[i]>stack.peek()) {
					stack.pop();
				}
			}
			if(stack.size()==0) {
				res[ind--]=-1;
			}
			else {
				res[ind--]=stack.peek();
			}
			stack.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Next greater element for "+arr[i]+" is:"+res[i]);
		}
	}

}
