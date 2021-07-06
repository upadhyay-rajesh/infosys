
public interface InterfaceDemo {
	public void add();
	public void sub();
}

class Parent{
	void mult() {
		
	}
}

interface Parent1{
	int p=9;
	void div(); 
}

class Interface_impl extends Parent implements InterfaceDemo,Parent1{

	public void add() {
		
		System.out.println(p);
		
	}

	public void sub() {
		
		
	}

	public void div() {
		// TODO Auto-generated method stub
		
	}
	
}
