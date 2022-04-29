package org.duplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicates {
	public static void main(String[] args) {
		Integer a[] = new Integer[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 10;
		a[4] = 40;
		List<Integer> l = Arrays.asList(a);
		Set<Integer> s = new HashSet<Integer>(l);
		int length = a.length;
		System.out.println(length);
		System.out.println("for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println(s);
		Map<Integer,Integer> integerMap = new HashMap<>();
		
		for(Integer i : s) {
			integerMap.put(i, i);
		}
		
		for(Entry<Integer, Integer> e : integerMap.entrySet()) {
			System.out.println(" Map Key "+ e.getKey() + " value "+ e.getValue());
		}
	}
}
