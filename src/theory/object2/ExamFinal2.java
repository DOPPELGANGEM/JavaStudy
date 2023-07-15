package theory.object2;

class Test2 {
	final int A = 10; //초기화 후 변경불가
	void method() {
		//A = 20; //변경불가
	}
}

public class ExamFinal2 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		//ob.A = 20; //변경불가
		System.out.println(ob.A); //일기전용
	}
}
