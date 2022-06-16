package com.Challenge;

/*
  1. write a program to count number of digits in a given number, for e.g. if 100 is given when 
  creating an object then the countDigits method should print 3 as output,  like wise 1000 then 4 , 100000 then 6*/
import java.util.Scanner;
public class NumberCount
{
	
	// attributes
	int number;
	int count ;
	
	NumberCount(int number){
		this.number = number;
	}
	
	// method
	void countDigits() 
	{
		//Scanner countNumber = new Scanner(System.in);
		//System.out.println("Enter the number to be counted : " +number);
		System.out.println("Number to counted :" +number);
		//number = countNumber.nextInt();
		
		// using while loop
		while (number > 0)
		{
			number = number / 10;
			count++;
		}
		
		System.out.println("Number of Digits in a given number: " + count);
	}
	
	//using Strings 
	/*
	 * // converting he number to string using 'to.String()'. String
	 * numCount=Integer.toString(number);
	 * 
	 * System.out.println("Number of Digits in a given number: "+
	 * numCount.length()); }
	 */	
	
}
