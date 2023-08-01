package com.interview.codings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
	static int last;

	static int sumOfDigits(int num) {
		if (num == 0) {
			return last;
		} else {
			int lastDigit = num % 10;
			last += lastDigit;
			num = num / 10;
			sumOfDigits(num);
		}
		return last;
	}

	public static void main(String... args) {

		// recursive method
		System.out.println("Recursive method: " + sumOfDigits(5674));

		// normal method
		int num = 5674;
		int copy = num;
		int result = 0;
		while (copy != 0) {
			int lastDigit = copy % 10;
			result += lastDigit;
			copy /= 10;
		}
		System.out.println(result);

		// java 8 stream method
		int number = 7456;

		int sum = Stream.of(String.valueOf(number).split(""))
				.collect(Collectors.summingInt(letter -> Integer.parseInt(letter)));
		System.out.println(sum);

	}
}
