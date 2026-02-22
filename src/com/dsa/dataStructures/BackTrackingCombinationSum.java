package com.dsa.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackTrackingCombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int target=7;
		System.out.println(subsets(arr,0,target));
	}
	public static List<List<Integer>> subsets(int arr[],int ind,int target){
		List<List<Integer>> result=new ArrayList<>();
		backtrack(arr,ind,result,new ArrayList(),target);
		Collections.sort(result,(a,b)->a.size()-b.size());
		return result;
	}
	public static void backtrack(int arr[],int ind,List<List<Integer>> result  ,List<Integer> current,int target) {
		if(sum(current)==target) {
			result.add(new ArrayList(current));
			return;
		}
		if(ind==arr.length||sum(current)>target) {
			return;
		}
		
		current.add(arr[ind]);
		backtrack(arr,ind,result,current,target);
		current.remove(current.size()-1);
		backtrack(arr,ind+1,result,current,target);
	}
	static int sum(List<Integer> current) {
		int sum=0;
		for(int num:current) {
			sum+=num;
		}
		return sum;
	}

}
