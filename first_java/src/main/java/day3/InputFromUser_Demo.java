package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser_Demo {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your first no");
		int i=sc.nextInt();
		
		System.out.println("enter your second no");
		int i1=sc.nextInt();
		
		System.out.println("addition is "+(i+i1));
		*/
		
		//what is checked exception?
		//compile time if system will force to handle some exception then those exception comes under checked exception 
		//like in below example for br.readLine() it is forcing me to handle IOException so IOException will come under checked exception
		
		//what is unchecked exception?
		//runtime exception is unchecked exception ex-ArithmeticException,NegativeArraySizeException
		//BufferedReader br=null;
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
		//br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your first no");
		String a=br.readLine();
		int i1=Integer.parseInt(a);
		
		if(i1==23) {
			throw new MyException();
		}
		
		System.out.println("enter your second no");
		String a1=br.readLine();
		int i2=Integer.parseInt(a1);
		
		System.out.println("division is "+(i1/i2));
		br.close();
		}
		catch(IOException e) {
			System.out.println("i am io exception "+e);
			e.printStackTrace();
		}
		catch(ArithmeticException e1) {
			System.out.println("i am arithmetic exception "+e1);
		}
		catch(MyException e2) {
			e2.printStackTrace();
		}
		//why finally block?
		//finally block will insure proper termination of your program means we must close all the resources inside finally block
		//either try block or catch block is executing but the finally block definitely execute.
	/*	finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} */
	}

}
