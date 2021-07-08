package day3;

import java.util.HashMap;

public class Map_Demo {

	public static void main(String[] args) {
	   HashMap h=new HashMap();
	   h.put("a", "America");
	   h.put("b", "India");
	   h.put("c", "Australia");
	   h.put("d", "Nepal");
	   h.put("e", "Pakistan");
	   
	   System.out.println(h.get("d"));

	}

}
