package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "ABC");
		map.put(3, "CCC");
		map.put(2, "BCD");
		map.put(5, "EEE");
		map.put(4, "DDD");		
		
		Iterator<Integer> itr=map.keySet().iterator();
		
		while(itr.hasNext()){
			int key=itr.next();
			
			System.out.println("Key: "+key+ " value: "+map.get(key));
			
		}
		System.out.println(map.entrySet());
		//System.out.println(map.remove(2));
		System.out.println(map.entrySet());
				
		Map<Integer,String> map2=new HashMap<Integer,String>();
		
		map2.put(1, "ABC");
		map2.put(3, "CCC");
		map2.put(2, "BCD");
		map2.put(5, "EEE");
		map2.put(4, "DDD");
		
		System.out.println(map.entrySet().equals(map2.entrySet()));
		
		int hash1=map.hashCode();
		int hash2=map2.hashCode();
		if(hash1==hash2){
			System.out.println(hash1+"Equal"+hash2);
		}
		else{
			System.out.println("Unequal");
		}	
		
		
	}

}
