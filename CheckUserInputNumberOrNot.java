package com.interview.codings;

import java.util.Scanner;

class Demo {
	static boolean numberOrNot(String num) {
		try {
			Long.parseLong(num);
		} catch (NumberFormatException e) {
			return false;

		}
		return true;
	}
}

public class CheckUserInputNumberOrNot {

	public static void main(String... args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter ur mobile number: ");
			String num = input.nextLine();
			num = num.replaceAll("\\s+", "");
			if (Demo.numberOrNot(num) && (num.length() == 10)) {
				System.out.println("Given mobile number is valid" + num);
			} else {
				System.out.println("Sorry ! ur entered mobile number is wrong " + num);
			}

		}

	}

}
