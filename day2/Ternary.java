package com.day2;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AGE:");
		int age=sc.nextInt();
		String name=(age>18)?"Eligible":"Not Eligible";
		System.out.println(name);

	}

}
