package theory.object2;

import java.util.Objects;

class TestA /* extends Object */ {
	int a;
	
	void methodA() {
		System.out.println("TestA기능! + a");
	}
	
 @Override
 public String toString() {
	 return "TestA[a="+a+"]";
 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 여기까지비교하면 밑에 다운캐스팅으로 비교해준다 (비교할맛이나겟군!?)
			return false;
		TestA other = (TestA) obj;
		if (a != other.a)
			return false;
		return true;
	}

	
}

public class ExamObject {
	public static void main(String[] args) {
		TestA oba1 = new TestA();
		oba1.a = 10;
		TestA oba2 = new TestA();
		oba2.a = 10;
		
		Object obj1 = oba1; //업캐스팅
		Object obj2 = oba2; //업캐스팅
		
		System.out.println(obj1); //toString(참조변수값을 출력하면 toString이 동작되게 내부에서 동작함)
		System.out.println(obj2);
		
		System.out.println(obj1 == obj2); // 동일 // 동일한객체인지비교 (그놈이그놈인지)
		System.out.println(obj1.equals(obj2)); //동등? // 객체가동등한지 
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}
}
