package day1;

public class A {
	public static int i=8;
	private int j=9;
	protected final int k=4;
	int m=2;
	
	
	final int square(int i, float f) {
		return (int)(i*f);
	}
	
	
	
	void add() {
		System.out.println("i am default method of class A");
		
		//k=9;
	}
	
	private void sub() {
		System.out.println("i am private method of class A");
	}
	
	public static void mult() {
		System.out.println("i am public method of class A");
	}
	
	protected void div() {
		System.out.println("i am protected method of class A");
	}
}
