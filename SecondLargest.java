package com.interview.codings;

public class SecondLargest {
	public static void getSecondLarge(int[] arr) {
		int firstLarge = arr[0], secondLarge = arr[1];

		for (int element : arr) {
			if (element > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = element;
			} else if ((element < firstLarge) && (element > secondLarge)) {
				secondLarge = element;
			}
		}
		System.out.println("Second largest: " + secondLarge);
	}

	public static void main(String... args) {
		int[] array = { 1, 2, 3, 4, 5 };
		getSecondLarge(array);
	}

}
