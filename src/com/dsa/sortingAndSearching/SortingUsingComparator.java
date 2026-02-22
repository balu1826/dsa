package com.dsa.sortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class SortingUsingComparator implements Comparator<SortingUsingComparator> {


	String book_name;
	String genre;
	String author;
	int year;
	public SortingUsingComparator(String book_name,String genre , String author ,int year) {
		this.book_name=book_name;
		this.genre=genre;
		this.author=author;
		this.year=year;
	}
	
	@Override
	public String toString() {
		return book_name+" "+author+" "+genre+" "+year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		SortingUsingComparator s1=new SortingUsingComparator("Khleja","Comedy","Trivikram",2010);
		SortingUsingComparator s2=new SortingUsingComparator("Pokiri","Cop","Puri",2004);
		SortingUsingComparator s3=new SortingUsingComparator("Murari","Family","KV",2000);
		SortingUsingComparator s4=new SortingUsingComparator("SVSC","Family","Srikanth",2013);
		ArrayList<SortingUsingComparator> arr=new ArrayList<>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		Comparator<SortingUsingComparator> byYear=(b1,b2)->Integer.compare(b1.year,b2.year);
		Comparator<SortingUsingComparator> byGenre =
		        (b1, b2) -> b1.genre.compareTo(b2.genre);

		arr.sort(byGenre);
		//Collections.sort(arr,byYear);
		//arr.sort(byYear);
		for(SortingUsingComparator obj:arr) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
	}

	@Override
	public int compare(SortingUsingComparator o1, SortingUsingComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}


