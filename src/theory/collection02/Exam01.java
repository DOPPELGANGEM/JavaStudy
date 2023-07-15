package theory.collection02;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam01 {
 public static void main(String[] args) {
	 HashMap hm = new HashMap();
	 
	 hm.put("hello", 100);
	 hm.put(10, "tester");
	 hm.put(10, new Info("홍길동", 20));
	 
	 System.out.println(hm.get(10));
	 System.out.println(hm.get("hello"));
	 System.out.println(hm.get(1));
	 System.out.println(hm.get(3213));
	
	 Set keys = hm.keySet();
	 Iterator it = keys.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 
	 for(Object o : keys) {
		 System.out.println(o);
	 }
	 
	 Collection values = hm.values();
	 for(Object o : values) {
		 System.out.println(o);
	 }
	 
	 it = keys.iterator();
	 while(it.hasNext()) {
		 Object key = it.next();
		 Object value = hm.get(key);
		 System.out.println(key + ":" + value);
	 }
	 
 }
}



