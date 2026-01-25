package com.dsa.fundamentals;

public class Problem15CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,0},
					   {0,1,0},
					   {1,1,0}};
		myApproach(arr);

	}
	public static void myApproach(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int ind=0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					if(count==1) {
						break;
					}
					else {
						count++;
						ind=j;
					}
				}
			}
			if(count==1) {
				if(celebrity(arr,ind)) {
					System.out.println("Celebrity:"+i);
					break;
				}
			}
		}
		
	}
	public static boolean celebrity(int arr[][],int ind) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][ind]!=1) {
				return false;
			}
		}
		return true;
	}

}
