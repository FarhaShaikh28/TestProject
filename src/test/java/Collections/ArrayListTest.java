package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	
	public static void main(String args[]){
		
		java.util.ArrayList<Object> al=new ArrayList<Object>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin"); 
		al.add(2);
		al.add(1);
		
		
		System.out.println(al.size());
		System.out.println(al.contains("Amit"));
		System.out.println(al.hashCode());
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Vijay"));
		//System.out.println(al.sort(););
		
		System.out.println("Element at 2nd position: "+al.get(2));  
		Iterator<Object> itr= al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
