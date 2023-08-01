package com.interview.codings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {
	public static void main(String... args) {

		int[] array = { 1, 1, 3, 2, 5, 4, 3, 2 };
		int length = array.length;
		int[] unique = new int[length];
		int second = 0;
		for (int element : array) {

			boolean isThere = false;
			for (int start = 0; start < second; start++) {
				if (array[start] == element) {
					isThere = true;
					break;
				}
			}
			if (!isThere) {
				unique[second] = element;
				second++;
			}
		}
		unique = Arrays.copyOf(unique, second);
		System.out.println(Arrays.toString(unique));

		// arraylist -- remove duplicate HashSet and linkedHashSet

		List<String> list = new ArrayList<>(Arrays.asList("Java", "Java", "Developer", "Software", "Developer"));
		System.out.println("With duplicates: " + list);

		Set<String> set = new HashSet<>(list);
		System.out.println("Without duplicates " + set);

	}
}
