package day1;

public class B {

	public static void main(String[] args) {
		//if one class want to use features(variable and methods) of other then it can use via object of other class
		A a=new A();
		
		a.add();
	//	a.sub();
		A.mult();
		a.div();
		
		System.out.println(A.i);
	//	System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.m);

	}

}
