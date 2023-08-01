package com.interview.codings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharactersString {
	public static void main(String... args) {
		String name = "JAVA Hello";
		Map<Character,Integer> map1=new HashMap<>();
		
		char[] character=name.toCharArray();
		for(int index=0;index<character.length;index++)
		{
			if(map1.containsKey(character[index]))
			{
				map1.put(character[index],map1.get(character[index])+1);
			}
			else
				map1.put(character[index],1);
		}
	
		Set<Character> keys=map1.keySet();
		
		for(Character c:keys)
		{
			if(map1.get(c)>1)
			{
				System.out.println(c+ ":"+map1.get(c));
			}
		}
		
		
		
		
		// using java 8 stream

		Map<Character, Long> map = name.chars().mapToObj(letter -> (char) letter)
				.collect(Collectors.groupingBy(letter -> letter, Collectors.counting()));
		System.out.println(map);

	}

}
