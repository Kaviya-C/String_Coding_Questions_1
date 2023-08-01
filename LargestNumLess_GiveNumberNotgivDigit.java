package com.interview.codings;

public class LargestNumLess_GiveNumberNotgivDigit {
	public static int getLess(int num, int digit) {
		char c = Integer.toString(digit).charAt(0);

		for (int index = num; index > 0; --index) {
			if (Integer.toString(index).indexOf(c) == -1) {
				return index;
			}
		}

		return digit;
	}

	public static void main(String... args) {
		int number = 143;
		int digit = 4;
		System.out.println(getLess(number, digit));

	}

}
