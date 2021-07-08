package day4;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_demo {

	public static void main(String[] args) throws Exception{
		FileReader fw=new FileReader("d:/myfile.txt");
		
		int c=0;
		while((c=fw.read())!=-1){
			System.out.println((char)c);
		}
		fw.close();
	}

}
