package com.first_java;

public class Hello {
	
	
	//global variable i.e. variable inside class. global variable will get space inside heap
	//if we will not assign value to global variable then system will assign default value
	int i;       //instance variable
	static int j; //class variable

	public static void main(String[] args) {
		
		String a=args[0];
		String b=args[1];
		
		//converting string into integer
		int p1=Integer.parseInt(a);
		int p2=Integer.parseInt(b);
		
		
		System.out.println(p1+p2);
		
		/*
		int k=3; //local variable i.e. variable inside method. local variable will get space inside stack
		//non static global variable can not be called inside static method so how to call? ans: via object of class
		Hello h=new Hello(); //if we will not write constructor then system will provide default constructor
		//what is object? object is an instance of a class
		System.out.println("Hello World! "+h.i);
		
		System.out.println(j);
		System.out.println(k); //local variable must have value
		
		long l=10L;
		int m=(int)l*5; //explicit type casting i.e. converting larger data type to smaller data type
		
		System.out.println(m);
		
		int s=20;
		long t=s*8; //implicit type casting i.e. converting smaller data type to larger data type
		System.out.println(t);
		*/

	}

}
