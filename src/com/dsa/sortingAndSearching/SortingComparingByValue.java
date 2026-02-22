package com.dsa.sortingAndSearching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingComparingByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Orange", 30);
        map.put("Mango", 20);

        // Convert map entries to a list
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());

        // Sort by value in ascending order
        sortedList.sort(Map.Entry.comparingByValue());

        // Print sorted entries
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
