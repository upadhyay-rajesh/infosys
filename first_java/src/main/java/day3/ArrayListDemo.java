package day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();//generic collection
		a.add("Rajesh");
	//	a.add(new Integer(23));
		a.add("Mohan");
		a.add("Sohan");
		//a.add(2.3f);
		
		a.add(2, "rakesh");
		
		System.out.println(a);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//important
		for(String p:a) {
			System.out.println(p);
		}
		
		Iterator it=a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator li=a.listIterator();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
