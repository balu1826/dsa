package com.dsa.dataStructures;

import java.util.Stack;

public class StackSlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
		int k=4;
		myApproach(arr,k);

	}
	public static void myApproach(int arr[],int k) {
		Stack<Integer> stack=new Stack<>();
		int res[]=new int[arr.length];
		res[arr.length-1]=arr.length-1;
		stack.push(arr.length-1);
		
		for(int i=arr.length-2;i>=0;i--) {
			if(stack.size()>0&&arr[i]>arr[stack.peek()]) {
				while(stack.size()>0&&arr[i]>arr[stack.peek()])
					stack.pop();
			}
			if(stack.size()==0)
				res[i]=arr.length;
			else
				res[i]=stack.peek();
			stack.push(i);
		}
		for(int i=0;i<arr.length-k;i++) {
			int j=i;
			while(res[j]<i+k) {
				j=res[j];
			}
			System.out.print(arr[j]+" ");
		}
	}

}
