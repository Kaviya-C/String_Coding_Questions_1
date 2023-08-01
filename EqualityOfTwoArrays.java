package com.interview.codings;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String... args) {

		int[] array1 = { 1, 4, 5, 6, 7 };
		int[] array2 = { 6, 5, 4, 1, 7 };
		Arrays.sort(array1);
		Arrays.sort(array2);
		boolean equal = true;

		if (array1.length == array2.length) {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index]) {
					equal = false;
				}
			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("Two array are equal");
		} else
			System.out.println("Two array are not equal");

		// using built in method to check the equality of two arrays:
		int[] a = { 11, 2, 34, 12 };
		int[] b = { 2, 34, 11, 12 };
		Arrays.sort(a);
		Arrays.sort(b);
		boolean yes = Arrays.equals(a, b);

		if (yes) {
			System.out.println("equal");
		} else {
			System.out.println("Not equal");

		}
		// if it is multidimensional array use deepEquals method;

		int[][] a1 = { { 1, 2, 3, 4 }, { 7, 5, 6 } };
		int[][] a2 = { { 1, 2, 3, 4 }, { 7, 5, 6 } };

		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.deepEquals(a1, a2));

	}

}
