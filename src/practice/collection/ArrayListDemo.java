package practice.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; //오류발생
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		// 제네릭(Generice)은 직역하자면 일반적인이라는 뜻이다. 부연설명하면 데이터형식에의존하지 않고 하나의 값이
		// 여러가지 다른 데이터 타입들을 가질 수 있도록 하는 방법이다.
		ArrayList<String> al = new ArrayList<String>(); //<String> => 제네릭
		al.add("one"); //one은 object타입으로 저장되있다.
		al.add("two");
		al.add("three");
		for(int i=0; i<al.size(); i++) {
			String value = al.get(i); //(String)안해주면 Object타입이라서 형변환해줘야한다? 근데옛날방식...
			System.out.println(al.get(i));
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