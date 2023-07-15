package theory.polymorphism;

class A {
	int a;
	A(){
		System.out.println("A()");
	}
	A(int a) {
		System.out.println("A(int a)");
	}
	void methodA() {System.out.println("A");}
}

class B extends A { // 클래스 B는 A를 상속하고 있다.
	int b;
	B(){  
		//super();
		super(10); // B클래스의 생성자가 호출이 되게 되었을 때 안쓰면 위에처럼 디폴트 생성자가 호출이되지만 부모의 생성자 중에 특정 생성자를 명시해서 선택할 수 있다.
		System.out.println("B()");
	}
	void methodB() {System.out.println("B");}
}

class C extends B { // 클래스 C는 B를 상속하고 있다.
	int c;
	C(){
		super();
		System.out.println("C()");
	}
	void methodC() {System.out.println("C");}
}

public class Exam { 
	public static void main(String[] args) {
		C ob = new C(); // 상속되어진 C클래스로 객체를 생성했을 때 C클래스 생성자를 통해서 super() 메서드가 호출이되면 상속받은 부모의 디폴트 생성자를 호출하게 되어있다.
		ob.a = 10;
		ob.b = 20;
		ob.c = 30;
		ob.methodA();
		ob.methodB();
		ob.methodC();
	}
}
