package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.google.common.collect.ObjectArrays;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List can contain ordered collection of duplicate elements
		
		//List is an Interface having ArrayList and LinkedList classes
		
		//In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
		
		Object[][] obj=(Object[][]) new Object();
		obj[0][0]="Farha";
		obj[0][1]=1;
		obj[0][2]='C';

		obj[1][0]=2;
		obj[1][1]='A';
		obj[1][2]="Ayaz";
		
		obj[2][0]='B';
		obj[2][1]=3;
		obj[2][2]="Shaikh";

		//java.util.ArrayList<ObjectArrays> al=new java.util.ArrayList<ObjectArrays>();
		
		Vector<Object> vector=new Vector<Object>();
		
		vector.add(obj);
		
		for (Object object : vector) {
			System.out.println(object);
		}
		
		Iterator<Object> itr= vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
