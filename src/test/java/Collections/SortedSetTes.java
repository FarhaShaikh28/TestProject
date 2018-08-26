package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Object> ss=new TreeSet<>();
		ss.add("ABC");
		ss.add("BCD");
		ss.add("MMM");
		ss.add("ASS");
		//ss.add(1);
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.contains("ABC"));
		System.out.println(ss.hashCode());
		System.out.println(ss.headSet("BCD"));
		System.out.println("tailset"+ss.tailSet("MMM"));
		System.out.println(ss.subSet("ABC", "MMM"));

		/*for (String string : ss) {
			System.out.println(string);
		}
		*/
		
		Iterator<Object> itr= ss.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
