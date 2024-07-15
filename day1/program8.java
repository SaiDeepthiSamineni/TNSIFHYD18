package com.day1;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Deepthi";
		String org=name;
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		
		}
		if(name.equals(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}
