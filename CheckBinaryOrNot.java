package com.interview.codings;

public class CheckBinaryOrNot {
	public static void main(String... args) {
		int num = 10210;

		int copy = num;

		boolean isBinary = true;

		while (copy != 0) {
			int lastDigit = copy % 10;

			if (lastDigit > 1) {
				isBinary = false;
				break;
			} else {
				copy /= 10;
			}
		}
		if (isBinary) {
			System.out.println("given number is Binary: " + num);
		} else {
			System.out.println("Given number is not binary: " + num);
		}
	}

}
