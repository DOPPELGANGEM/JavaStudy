package theory.This;

class Test01 { // This 생성자 this()
	int a = 1;
	public Test01() {
		this(100); // 다른 생성자 호출 (사용은많이하지않는다..)
		System.out.println("Test01()");
	}
	
	public Test01(int a) {
		System.out.println("Test01(int)");
		this.a = a;
	}
}

public class ExamThis {

	public static void main(String[] args) {
		Test01 ob1 = new Test01();
		Test01 ob2 = new Test01(10);
		System.out.println(ob1.a);
		System.out.println(ob2.a);
	}

}
