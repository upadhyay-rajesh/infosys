package day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

import day3.Employee;

public class object_demo {

	public static void main(String[] args)throws Exception {
		
		//String ss=new String("i am java language");
		
		Employee e1=new Employee();
		e1.setName("mohan");
		e1.setPassword("abcd");
		e1.setEmail("mohan@yahoo.com");
		e1.setAddress("Bangalore");
		
		File f1=new File("d:/infosys.txt");
		//FileWriter f=new FileWriter(f1);
		
		FileOutputStream f=new FileOutputStream(f1);
		
		ObjectOutputStream oo=new ObjectOutputStream(f);
		
		oo.writeObject(e1);
		
		System.out.println("object written successfully");
		
		oo.close();
		f.close();

	}

}
