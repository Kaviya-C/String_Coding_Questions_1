package com.interview.codings;

import java.util.Arrays;

public class ContinousSubArray {
	static void contSubArray(int[] a, int num) {
		int sum = a[0];

		int start = 0;

		for (int index = 1; index < a.length; index++) {
			sum = sum + a[index];

			while (sum > num && start <= index) {

				sum = sum - a[start];
				start++;

			}
			if (sum == num) {
				System.out.println("Continous Sub array: ");

				for (int i = start; i <= index; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String... args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int target = 15;
		System.out.println("Given array: "+Arrays.toString(array));
		System.out.println("Target: "+target);
		
		contSubArray(array, target);
	}

}
