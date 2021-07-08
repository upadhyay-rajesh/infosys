package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Demo {

	public static void main(String[] args) {
		/*List<String> ll=new ArrayList<String>();
		ll.add("mohan");
		ll.add("Lalitha");
		ll.add("ajay");
		ll.add("sai");
		ll.add("Bhavani");
		ll.add("34");
		ll.add("12");
		
		System.out.println("before sorting");
		System.out.println(ll);
		
		Collections.sort(ll);
		
		System.out.println("after sorting");
		System.out.println(ll);
		*/
		
		List<Employee> ll=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setName("mohan");
		e1.setPassword("abcd");
		e1.setEmail("mohan@yahoo.com");
		e1.setAddress("Bangalore");
		
		ll.add(e1);
		
		Employee e2=new Employee();
		e2.setName("ajay");
		e2.setPassword("abcd");
		e2.setEmail("abc@gmail.com");
		e2.setAddress("Chennai");
		
		ll.add(e2);
		
		Employee e3=new Employee();
		e3.setName("kapoor");
		e3.setPassword("abcd");
		e3.setEmail("kapoor@rediff.com");
		e3.setAddress("Hyderabad");
		
		ll.add(e3);
		
		Employee e4=new Employee();
		e4.setName("niharika");
		e4.setPassword("abcd");
		e4.setEmail("niharika@yahoo.com");
		e4.setAddress("Delhi");
		
		ll.add(e4);
		
		Collections.sort(ll,new Sorting_tech());
		
		for(Employee ee:ll) {
			System.out.println("*****************");
			System.out.println(ee.getName());
			System.out.println(ee.getEmail());
			System.out.println(ee.getAddress());
			System.out.println("*****************");
		}

	}

}
















