package com.interview.codings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementArray {
	public static void main(String... args) {
		/*
		 * brute force
		 * sorting
		 * set
		 * map
		 * java8
		 */
		int[] number = { 12, 11, 3, 123, 11, 2, 2 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int each : number) {
			if (map.containsKey(each)) {
				map.put(each, map.get(each) + 1);
			} else
				map.put(each, 1);
		}
		System.out.println("Given array: " + Arrays.toString(number));
		Set<Integer> keys = map.keySet();
		System.out.println("Duplicate element in given array: ");
		for (int dup : keys) {
			if (map.get(dup) > 1) {

				System.out.print(dup + " ");
			}
		}

		System.out.println();

		// using java 8 stream
		String[] str = { "Java", "Developer", "Kaviya", "Developer" };
		Set<String> set1 = new HashSet<>();
		Arrays.stream(str).filter(word -> !set1.add(word)).forEach(System.out::println);

		Set<Integer> set = new HashSet<>();
		int[] array = { 11, 2, 1, 1, 11, 2 };
		List<Integer> list = Arrays.stream(array).filter((a) -> !set.add(a)).boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}
