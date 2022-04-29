package org.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Format {
	public static void main(String[] args) {
		Integer a[] = new Integer[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("for loop");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		List<Integer> li = new ArrayList<>();
		li.addAll(Arrays.asList(a));
		System.out.println(li);
		
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(li);
		System.out.println("Set -> "+ li);
		System.out.println("Enhanced for loop");
		for(Integer x:s) {
			System.out.println(x);
			}
		}

}
