package day4;

import java.util.ArrayList;
import java.util.List;

import day3.Employee;

public class Stream_Demo {

	public static void main(String[] args) {
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
		
		Employee e5=new Employee();
		e5.setName("Ayush Kumar");
		e5.setPassword("abcd");
		e5.setEmail("ayush@yahoo.com");
		e5.setAddress("Delhi");
		
		ll.add(e5);
		
		
		ll.stream().filter(e->e.getAddress().equals("Delhi")).map(e7->e7.getName()).forEach(System.out::println);
		ll.parallelStream().filter(e->e.getAddress().equals("Delhi")).map(e7->e7.getName()).forEach(ee1->{
			System.out.println("*****************");
			System.out.println(ee1);
			System.out.println("*****************");
		});
			

	}

}

















