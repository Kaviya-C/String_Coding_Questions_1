package com.interview.codings;
import java.util.Scanner;
public class AdditionMatrix 
{
	public static void main(String...args)
	{
		try(Scanner input=new Scanner(System.in)){
			System.out.println("Enter Rows: ");
			int row=input.nextInt();
			System.out.println("Enter Column: ");
			int col=input.nextInt();
			
			int[][] array=new int[row][col];
			System.out.println(" Enter the elements: ");
			for(int index=0;index<row;index++)
			{
				for(int next=0;next<col;next++)
				{
					array[index][next]=input.nextInt();
				}
			}
			System.out.println("Enter the elements: ");
			int[][] array2=new int[row][col];
			for(int index=0;index<row;index++)
			{
				for(int next=0;next<col;next++)
				{
					array2[index][next]=input.nextInt();
				}
			}
			System.out.println("First Matrix ");
			for(int[] first:array)
			{
				for(int second:first)
				{
					System.out.print(second+" ");
				}
				System.out.println();
			}
			System.out.println("second Matrix ");
			for(int[] first:array2)
			{
				for(int second:first)
				{
					System.out.print(second+" ");
				}
				System.out.println();
			}
			
			int[][] sum=new int[row][col];
			System.out.println("Sum of two matrix is: ");
			for(int index=0;index<row;index++)
			{
				for(int next=0;next<col;next++)
				{
					sum[index][next]=array[index][next]+array2[index][next];
					System.out.print(sum[index][next]+" ");
				}
				System.out.println();
			}
			
			
			System.out.println("subtraction of two matrix is: ");
			for(int index=0;index<row;index++)
			{
				for(int next=0;next<col;next++)
				{
					sum[index][next]=array[index][next]-array2[index][next];
					System.out.print(sum[index][next]+" ");
				}
				System.out.println();
			}
			System.out.println("Multiplication of two matrix is: ");
			for(int index=0;index<row;index++)
			{
				for(int next=0;next<col;next++)
				{
					sum[index][next]=array[index][next]*array2[index][next];
					System.out.print(sum[index][next]+" ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
