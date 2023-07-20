package practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcept {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		ArrayList<Student> members = new ArrayList<Student>(); //타입설정 Student객체만 사용가능
//		ArrayList<Integer> num = new ArrayList<Integer>(); // 타입설정 int타입만사용가능
//		ArrayList<Integer> num2 = new ArrayList<>(); // new에서 타입 파라미터 생략가능
//		ArrayList<Integer> num3 = new ArrayList<Integer>(10); //초기 용량(capacity) 지정
//		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3)); // 생성시 값추가
		
		//ArrayList 클래스 사용하기
		//ArrayList => 컬렉션의 또 다른 하위 인터페이스인 List는 데이터를 저장할 때 순서가 있어서 중복저장이 가능하다.
		//저장된 위치값을 사용할 수 있기 때문에 컬렉션 중간에 값을 삽입하거나 수정하는 작업 등 Set보다 훨씬 다양한 기능을 처리하는 메소드를 제공한다.
		//List는 인터페이스이기 때문에 ArrayList클래스를 통해 구현해서 사용할 수 있음
		
		// https://xianeml.tistory.com/39
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		list.add("홍길동");
		
		System.out.println("=====");
		
		System.out.println("0위치값 출력: " + list.get(0));
		System.out.println("toString() 전체 출력 : " + list);
		
		System.out.println("=====");
		
		for(String data : list) {
			System.out.println("forEach 전체 출력" + data);
		}
	}
}
