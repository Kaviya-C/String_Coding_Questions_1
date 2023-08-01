package com.interview.codings;

public class ArmstrongNumber 
{
	public static void main(String...args)
	{
		int number=121;
		
		int length=String.valueOf(number).length();
		
		int copy=number;
		
		int sum=0;
		
		while(copy!=0)
		{
			int lastDigit=copy%10;
			
			int power =1;
			
			for(int start=0;start<length;start++)
			{
				power=power*lastDigit;
			}
			sum+=power;
			copy/=10;
		}
		if(sum==number)
		System.out.println("Yes armstrong: "+number+" "+sum);
		else
			System.out.println("No armstrong: "+number+" "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 // 1 +125 +27==153,371
//		int copy=number;
//		int count=String.valueOf(number).length();
//		int sum=0;
//		while(copy!=0)
//		{
//		int lastDigit=copy%10;
//		int power=1;
//		for(int index=0;index<count;index++)
//		{
//			//System.out.println(index);
//			power=power*lastDigit;
//			//System.out.println(power);
//		}
//		System.out.println(sum);
//		sum+=power;
//		System.out.println(sum);
//		copy=copy/10;
//		}
//		if(sum==number)
//		{
//			System.out.println("Yes it is armstrong number..");
//		}
//		else
//		{
//			System.out.println(" Not it is not armstrong");
//		}
		
	}

}
