package day1;

public class C extends A{
	
	
	
	protected int square(int i, float f) {
		return 2;
	}

	public static void main(String[] args) {
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
