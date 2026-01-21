package com.dsa.dataStructures;

import java.util.Stack;

public class SpanOfStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,9,3,1,12,6,8,7};
		myApproach(arr);
		System.out.println();
		System.out.println("------------------------------------");
		optimizedApproach(arr);

	}
	public static void myApproach(int arr[]) {
		System.out.print(1+" ");
		for(int i=1;i<arr.length;i++) {
			System.out.print(span(arr,i)+" ");
		}
	}
	public static int span(int arr[], int ind) {
		int count=1;
		for(int i=ind-1;i>=0;i--) {
			if(arr[ind]>arr[i])
				count++;
			else 
				return count;
		}
		return count;
	}
	
	
	public static void optimizedApproach (int[] arr) {
		Stack<Integer> stack=new Stack<>();
		System.out.print(1+" ");
		stack.push(0);
		for(int i=1;i<arr.length;i++) {
			if(stack.size()>0&&arr[i]>arr[stack.peek()]) {
				while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]) {
					stack.pop();
				}	
			}
			if(stack.size()==0) {
				System.out.print(i+1+" ");
				
			}
			else {
				System.out.print(i-stack.peek()+" ");
				
			}
			stack.push(i);
		
		}
	}

}
