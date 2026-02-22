package com.dsa.sortingAndSearching;



import java.util.*;
public class ReverseInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Orange", 30);
        map.put("Mango", 20);

        // TreeMap with reverse order comparator for keys
        Map<String, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(map);

        // Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
