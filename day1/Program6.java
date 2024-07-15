package com.day1;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Deepthi";
		String revstring="";
		System.out.println(name);
		for(int i=name.length()-1;i>=0;i--) {
		revstring=revstring+name.charAt(i);
		}
		System.out.println(revstring);

	}

}
