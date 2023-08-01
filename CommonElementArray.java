package com.interview.codings;


import java.util.HashSet;
import java.util.Set;

public class CommonElementArray {
	public static void main(String... args) {

		// retainAll--two set two list only use this
		// retainAll only applicable for collections..

		int[] array1 = { 5, 6, 7, 8 };
		int[] array2 = { 2, 3, 4, 5, 6 };
		// without built in method
		Set<Integer> set = new HashSet<>();

		for (int first = 0; first < array1.length; first++) {
			for (int second = 0; second < array2.length; second++) {
				if (array1[first] == array2[second]) {
					set.add(array1[first]);
				}
			}
		}
		System.out.println(set);
	}

}
