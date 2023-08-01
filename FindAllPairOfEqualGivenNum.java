package com.interview.codings;

import java.util.Arrays;

public class FindAllPairOfEqualGivenNum {
	static void allPairBetterComplexity(int[] array, int num) {
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;

		while (first < last) {
			if (array[first] + array[last] == num) {
				System.out.println(array[first] + " + " + array[last] + " = " + num);
				first++;
				last--;
			} else if (array[first] + array[last] < num) {
				first++;
			} else if (array[first] + array[last] > num) {
				last--;
			}
		}

	}

	/*
	 * time complexity for this below is O(n^2) not recommended below steps better
	 * time complexity is O(nLogn)-- work for sorted arrays
	 */
	static void allPair(int[] a,int target)
	{
		for(int index=0;index<a.length;index++)
		{
			for(int next=index+1;next<a.length;next++)
			{
				if(a[index]+a[next]==target)
				{
					System.out.print(a[index]+" + "+a[next]+" = "+target);
				}
			}
			System.out.println();
		}
	}
	public static void main(String... args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum = 6;
		System.out.println("Given array: " + Arrays.toString(array));
		allPair(array, sum);
		System.out.println("Given array: " + Arrays.toString(array));
		allPairBetterComplexity(array, sum);
	}

}
