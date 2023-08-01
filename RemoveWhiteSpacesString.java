package com.interview.codings;

import java.util.Scanner;

public class RemoveWhiteSpacesString {
	public static void main(String... args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the string: ");
			String input = in.nextLine();

			char[] characterArray = input.toCharArray();

			String result = "";

			for (int start = 0; start < input.length(); start++) {
				if ((characterArray[start] != ' ') && (characterArray[start] != '\t')) {
					result += characterArray[start];
				}
			}

			System.out.println("Output of : " + result);
		}
		// using built in method
		String s = " hello  world";
		s = s.trim();// remove the space from begin and end
		String s1 = s.strip();
		System.out.println(s1);// remove space from begin and end
		s = s.replaceAll("\\s+", "");
		System.out.println(s);
	}

}
