
public class Array_demo {

	public static void main(String[] args) {
		/*int c[]= {2,5,3,6,8};
		System.out.println(c.length); //5
		
		
		for(int p:c) {
			System.out.println(p);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		*/
		
		add(34,56,78);
		add(34,56,78,4,3,2,6);
	}
	
	public static void add(int... c) {  //var arg
		for(int pp:c) {
			System.out.println(pp);
		}
	}

}
