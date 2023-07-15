package theory.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Exam01 {
 public static void main(String[] args) {
	HashSet hs = new HashSet(); // HashSet 
	hs.add("hello");
	hs.add(10); //new Integer(10) auto-boxing
	hs.add(20);
	hs.add(30);
	hs.add(20);
	
	Iterator it = hs.iterator(); //반복자
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

// ---Collection :  데이터를 수집하기 위한 집합
// -Set : 비순차적 저장, 중복데이터 불허
// -Map : 비순차적 저장, 중복데이터 허용
// -List : 순차적 저장, 중복데이터 허용

// ---Framework
// - 틀,구조

// ---Collection Framework
// - "데이터를 수집하여 저장"하기 위해 사용할 수 있도록 정의해 놓은 클래스 집합

