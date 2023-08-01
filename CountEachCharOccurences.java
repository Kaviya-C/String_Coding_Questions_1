package com.interview.codings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharOccurences {
	public static void main(String... args) {

		String sentences = "Java J2EE java JSP";

		String input = sentences.replaceAll("\\s+", "");
		char[] character = input.toCharArray();

		Map<Character, Integer> m = new HashMap<>();
		for (char c : character) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		var entry = m.entrySet();
		for (var e : entry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		// using java 8 stream:
		String name = "favourite";
		Map<Character, Long> map = name.chars().mapToObj(letter -> (char) letter)
				.collect(Collectors.groupingBy(letter -> letter, Collectors.counting()));

		System.out.println(map);

	}

}
