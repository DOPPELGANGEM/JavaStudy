package theory.temp;

class A {
	int pack;
	private int pri;
	protected int pro;
	public int pub;
	
	void method() {
		pack = 10;
		pri = 10;
		pro = 10;
		pub = 10;
	}
}

class B extends A {
	void methodB() {
		pack = 10;
		//pri = 10; //접근 불가
		pub = 10;
		pro = 10;
	}
}

public class ExamProtected {

}
