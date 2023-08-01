package com.interview.codings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramProgram 
{
	public static void main(String...args)
	{
		/*
		 * anagram--> method-- java 8
		 * 					-- sort and equals
		 * 					-- iterative method
		 * 					-- StringBuilder
		 */
		//using iterative method:
		String first="Silent cat";
		String second="listen Act";
		
		String copy1=first.replaceAll("\\s+","").toLowerCase();
		String copy2=second.replaceAll("\\s+","").toLowerCase();
		boolean status=true;
		if(copy1.length()!=copy2.length())
		{
			status =false;
		}
		else
		{
			char[] firstArray=copy1.toCharArray();
			for(char each:firstArray)
			{
				int index=copy2.indexOf(each);
				if(index!=-1)
				{
					copy2=copy2.substring(0,index)+copy2.substring(index+1,copy2.length());
					System.out.println(copy2+" "+index);
				}
				else
				{
					status=false;
					break;
				}
			}
		}
		if(status)
		{
			System.out.println(first+" "+second+" are anagram");
		}
		else
		{
			System.out.println(first+" "+second+" are not anagrams");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//sort() equals()
		String a="Keep";
		String b="peek";
		String copya=a.replaceAll("\\s","").toLowerCase();
		String copyb=b.replaceAll("\\s","").toLowerCase();
		boolean status1=true;
		if(copya.length()!=copyb.length())
		{
			status1=false;
		}
		else
		{
			char[] charactera=copya.toLowerCase().toCharArray();
			char[] characterb=copyb.toLowerCase().toCharArray();
			Arrays.sort(charactera);Arrays.sort(characterb);
			status1=Arrays.equals(charactera, characterb);
		
		}
		if(status1)
		{
			System.out.println("Yes it is Anagram "+a);
		}
		else
			System.out.println("No it is not anagram");
		
		// using java 8
		String s1="Mother in Law";
		String  s2="Hitler Woman";
		
		s1=Arrays.stream(s1.split("")).map(letter->letter.toUpperCase()).sorted().collect(Collectors.joining());
		s2=Stream.of(s1.split("")).map(letter->letter.toUpperCase()).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2))
		{
			System.out.println(" first string: "+s1+"\nSecond String: "+s2);
			System.out.println("Two strings are anagram");
		}
		else
		{
			System.out.println(" first string: "+s1+"\nSecond String: "+s2);
			System.out.println("Two strings are not  anagram");
		}
	}

}
