package com.si.sample23;
class A{
	void display() {
		System.out.println("content of class A");
	}
}
class B extends A{
	void display() {
		System.out.println("CONTENT OF CLASS B");
	}
}


public class C {

	public static void main(String[] args) {
		A b1=new B();
		b1.display();
		
		// TODO Auto-generated method stub

	}

}
