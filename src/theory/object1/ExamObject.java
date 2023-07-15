package theory.object1;

class TestA /* extends Object */ { // 아무것도 상속하지않지만 자동적으로 Object를 상속한다.
	
}

// Object 클래스들이가지고 있는 클래스들이 있는데 이런결과를 보여주고 있고 내가 만든 클래스든 어떤 클래스는 Object를 상속한다.
// 모든객체를 Object로관리가 가능하다.
public class ExamObject {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		//obj가 가지고 있는데 메소드로 실행해보고있는중이다.
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		TestA oba1 = new TestA();
		TestA oba2 = new TestA();
		TestA oba3 = oba1;
		
		//Test A에는 아무것도 정의한게없지만 Object를 무조건 상속하기때문에 실행이가능하다!!
		System.out.println(oba1.toString());
		System.out.println(oba1.hashCode());
		System.out.println(oba2.toString());
		System.out.println(oba2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
	}
}
