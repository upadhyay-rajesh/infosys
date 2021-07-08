package day4;

import java.io.FileWriter;

public class FileWriter_demo {

	public static void main(String[] args)throws Exception {
		
		String ss="hello how are you?";
		FileWriter fw=new FileWriter("d:/myfile.txt");
		
		for(int i=0;i<ss.length();i++) {
		fw.write(ss.charAt(i));
		}
		
		fw.close();
		System.out.println("data written");

	}

}
