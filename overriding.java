package com.si.sample23;
  class A1{
	void display() {
		System.out.println("class A display content");
	}
	static void print() {
	System.out.println("class A static content");
	}
}
   class B1  extends A1{
	void display() {
		System.out.println("class B display content");
	}
	static void print() {
		System.out.println("class B static content");
	}
}


public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 b1=new B1();
		b1.display();
		B1.print();

	}

}
