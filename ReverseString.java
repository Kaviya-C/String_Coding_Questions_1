package com.interview.codings;

public class ReverseString {
	static String recursiveMethod(String s) {
		if ((s == null) || (s.length() <= 1)) {
			return s;
		}
		// aviya +k
		// viya +ak
		// iya +vak
		// ya +ivak
		// a +yivak
		// +ayivak
		//

		return recursiveMethod(s.substring(1)) + s.charAt(0);
	}

	public static void main(String... args) {

		// Using recursive way to reverse the string:
		String name = "kaviya";
		System.out.println("Original: " + name);
		System.out.println("Using recursive method: " + recursiveMethod(name));

		// Using string buffer to reverse the string:
		String s = "Kaviya Java";
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Given :" + sb);
		sb.reverse();
		System.out.println("Reverse by string buffer: " + sb);

		// Using for loop to reverse the string:
		String sentences = "Kaviya java developer";
		String reverse = "";
		for (int index = sentences.length() - 1; index >= 0; index--) {
			reverse += sentences.charAt(index);

		}
		System.out.println("Original: " + sentences);
		System.out.println("Reverse: " + reverse);

	}

}
