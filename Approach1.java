package com.si.sample23;

public class Approach1 {
	String batsmen="Virat Kohli";
	static String bowler="Pathirana";
	void display() {
		System.out.println("About Cricket");
	}
	static String display1() {
		return "Static Method";
		
	}
	
	public static void main(String[] args) {
		Approach1 a1=new Approach1();
		System.out.println(a1.batsmen);
		System.out.println(Approach1.bowler);
		a1.display();
		System.out.println(Approach1.display1());

		
		
	}

}
