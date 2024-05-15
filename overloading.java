package com.si.sample23;
class Sai{
	void print() {
		System.out.println("display 1 content");
	}
	static void display() {
			System.out.println("static display content");
	}
		
	
//class Deepthi extends Sai{
	void print(int a) {
		System.out.println("class B content");
		
	}
	static void display(int a) {
		System.out.println("class b static content");
		
	}
}

public class overloading {

	public static void main(String[] args) {
		Sai b1=new Sai();
		b1.display();
		Sai.display(10);
		b1.display(20);
		Sai.display();
		
		// TODO Auto-generated method stub

	}

}
