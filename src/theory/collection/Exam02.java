package theory.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Exam02 {
 public static void main(String[] args) {
	HashSet<Integer> hs = new HashSet<>(); // HashSet 
	//Generic선언(일반화시킨다)
	
	//hs.add("hello");
	hs.add(10); //new Integer(10) auto-boxing
	hs.add(20);
	hs.add(30);
	hs.add(20);
	//hs.add(new Info("홍길동", 20));
	
	Iterator<Integer> it = hs.iterator(); //반복자
	while(it.hasNext()) { //순회
		System.out.println(it.next());
	}
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.remove(30));
	System.out.println(hs.contains(30));
	System.out.println(hs.size());
	
	it = hs.iterator(); // 한번썻으면다시 생성해야됨
	while(it.hasNext()) { //순회
		System.out.println(it.next()); // 출력안됨 HashSet()으로 가져온 Iterator를 참조하는데 이 Iterator에 next를 한다는 것은 iterator에 참조할 수 있는 요소를 끝가지 이동시키면서 이동
	}
 }
}



