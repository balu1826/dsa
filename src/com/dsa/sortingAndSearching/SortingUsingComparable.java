package com.dsa.sortingAndSearching;

import java.util.*;

public class SortingUsingComparable implements Comparable<SortingUsingComparable> {

	String book_name;
	String genre;
	String author;
	int year;
	public SortingUsingComparable(String book_name,String genre , String author ,int year) {
		this.book_name=book_name;
		this.genre=genre;
		this.author=author;
		this.year=year;
	}
	@Override
	public int compareTo(SortingUsingComparable s2) {
		SortingUsingComparable s1=this;
		Integer year1=s1.year;
		Integer year2=s2.year;
		return year1.compareTo(year2);
		
	}
	@Override
	public String toString() {
		return book_name+" "+author+" "+genre+" "+year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingUsingComparable s1=new SortingUsingComparable("Khleja","Comedy","Trivikram",2010);
		SortingUsingComparable s2=new SortingUsingComparable("Pokiri","Cop","Puri",2004);
		SortingUsingComparable s3=new SortingUsingComparable("Murari","Family","KV",2000);
		SortingUsingComparable s4=new SortingUsingComparable("SVSC","Family","Srikanth",2013);
		ArrayList<SortingUsingComparable> arr=new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		Collections.sort(arr);
		for(SortingUsingComparable obj:arr) {
			System.out.println(obj);
		}
			
	}
}

