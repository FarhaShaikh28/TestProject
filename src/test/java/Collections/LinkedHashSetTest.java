package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Farha");
		hs.add("Vijay");  
		hs.add("Kumar");  
		hs.add("Sachin");  
		hs.add("Sachin"); 
		System.out.println(hs.size());
		System.out.println(hs.contains("Amit"));
		System.out.println(hs.hashCode());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Farha"));
		//System.out.println(hs.parallelStream());
		
		  
		for(String s:hs){  
		 System.out.println(s);  
	 
		}
		

	}

}
