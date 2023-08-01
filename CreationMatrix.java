package com.interview.codings;

import java.util.Scanner;

public class CreationMatrix {
	public static void main(String... args) {

		// dynamic creation getting values from the user:
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter no of rows: ");
			int rows = input.nextInt();
			System.out.println("Enter no of columns: ");
			int columns = input.nextInt();

			int[][] array = new int[rows][columns];
			for (int index = 0; index < rows; index++) {
				for (int next = 0; next < columns; next++) {
					array[index][next] = input.nextInt();
				}
			}

			for (int[] first : array) {
				for (int el : first) {
					System.out.print(el + " ");
				}
				System.out.println();
			}

		}

		// it is static creation mean--values are given at compile time
		int[][] array1 = new int[][] { { 1, 2, 4 }, { 5, 6, 7 } };
		for (int[] element : array1) {
			for (int each : element) {
				System.out.print(each + " ");
			}
			System.out.println();
		}

	}

}
