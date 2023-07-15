package theory.object2;

class Test3 {
	final void method1() {} //자식에서 재정의 불가
	void method2() {} //자식에서 재정의 가능
}

class Test3Sub extends Test3 {
//	@Override
//	void method1() {} //불가능
	
	@Override
	void method2() {}
	
}

public class ExamFinal3 {
	public static void main(String[] args) {
		
	}
}
