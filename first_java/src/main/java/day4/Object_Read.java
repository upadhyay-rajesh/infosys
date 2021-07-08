package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day3.Employee;

public class Object_Read {

	public static void main(String[] args)throws Exception {
		File f1=new File("d:/infosys.txt");
		//FileWriter f=new FileWriter(f1);
		
		FileInputStream f=new FileInputStream(f1);
		
		ObjectInputStream oo=new ObjectInputStream(f);
		
		Employee a=(Employee)oo.readObject();
		System.out.println(a.getAddress()+"   "+a.getName());

	}

}
