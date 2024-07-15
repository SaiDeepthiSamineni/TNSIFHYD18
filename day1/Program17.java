package com.day1;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    int count = 0;
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enter a number:");
			    int num=sc.nextInt();

			    for (; num != 0; num /= 10, ++count) {
			    }

			    System.out.println("Number of digits: " + count);

	}

}
