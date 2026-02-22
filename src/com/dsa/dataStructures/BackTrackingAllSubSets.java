package com.dsa.dataStructures;
//Apply this pattern algorithm in other problems such as combination sum ... in leetcode ,problem nos:39,40
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackTrackingAllSubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(subsets(arr,0));
	}
	public static List<List<Integer>> subsets(int arr[],int ind){
		List<List<Integer>> result=new ArrayList<>();
		backtrack(arr,ind,result,new ArrayList());
		Collections.sort(result,(a,b)->a.size()-b.size());
		return result;
	}
	
	public static void backtrack(int arr[],int ind,List<List<Integer>> result  ,List<Integer> current) {
		if(ind==arr.length) {
			result.add(new ArrayList(current));
			return;
		}
		current.add(arr[ind]);
		backtrack(arr,ind+1,result,current);
		current.remove(current.size()-1);
		backtrack(arr,ind+1,result,current);
	}

}
