
public abstract class Abstract_demo {
	public void add() {
		
	}
	
	public void sub() {
		System.out.println("i am without parameter");
	}
	
	public void sub(int i,int j) {
		System.out.println("i am int parameter"+(i+j));
	}
	
	public void sub(float i, float j) {
		System.out.println("i am float parameter"+(i+j));
	}
}

class Child extends Abstract_demo{
	
}

class Access{
	public static void main(String[] args) {
		Abstract_demo a=new Child(); //here abstract class reference is refering to child class object
		a.sub();
		
		a.sub(3,5);
		a.sub(2.3f,4.5f);

	}
}
