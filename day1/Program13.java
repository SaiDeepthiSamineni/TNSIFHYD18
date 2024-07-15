package com.day1;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
