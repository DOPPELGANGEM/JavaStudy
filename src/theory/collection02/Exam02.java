package theory.collection02;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam02 {
 public static void main(String[] args) {
	 HashMap<Integer, Info> hm = new HashMap<>(); //  
		//Generic선언(일반화시킨다)
		
		//hm.put("hello");
	 	//hm.put(10, "tester")
	 	hm.put(4213, new Info("홍길동", 20));
	 	hm.put(123, new Info("홍길동", 20));
	 	hm.put(531421,new Info("홍길동", 20));
		
	
		System.out.println(hm.get(4213));
		//System.out.println(hm.get("hello"));
		System.out.println(hm.get(1));
		System.out.println(hm.get(531421));
		
		
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> it = keys.iterator(); 
		while(it.hasNext()) { 
			System.out.println(it.next()); 
		}
		
		for(Object o : keys) {
			System.out.println(o);
		}
		
		Collection<Info> values = hm.values();
		for(Info o : values) {
			System.out.println(o);
		}
		
		it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			Info value = hm.get(key);
			System.out.println(key + ":" + value);
		}
 }
}



