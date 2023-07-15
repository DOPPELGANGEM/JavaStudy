package theory.staticEx;

class Print {
	
	public String delimiter;
	
	public void a() { // ★★★★★ 메소드가 인스턴스의 소속일때는 static을 빼주어야 한다. 그래서 여기 static을 빼주어야한다. ★★★★★
		System.out.println(this.delimiter); // this.delimiter는 우리가 t1 인스턴스 변수의 값으로 지정한 t1.delimiter = "-" 라고 지정한 이 값이되는것이다.
		System.out.println("a"); // a는인스턴스소속
		System.out.println("a");
	}
	
	public void b() { // ★★★★★ 메소드가 인스턴스의 소속일때는 static을 빼주어야 한다. 그래서 여기 static을 빼주어야한다. ★★★★★
		System.out.println(this.delimiter);
		System.out.println("b"); // b는인스턴스소속
		System.out.println("b");
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c"); // c는인스턴스소속
		System.out.println("c");
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
		
	//★★★★★ static - class method ★★★★★ => static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	//★★★★★ no static - instance method ★★★★★ 
	// static 변수(정적변수) :  메모리에 고정적으로 할당되어, 프로그램이 종료될 때 해제되는 변수
	// Static 메소드(정적 메소드) : 객체의 생성 없이 호출 가능, 객체에서는 호출이 가능은 하지만 지양한다.
	// static은 인스턴스 생성 상관없이 먼저 생성됨
		
		
//		 Print.a("-"); => 클래스인 Print의 소속으로 실행이 되는것이다. 하지만 메소드가 클래의 소속일 때는 "static" 이있어야한다.
//		 Print.b("-");
		
		// 1.new가앞에있으면 복제가됨 그리고 그 복제된 것을 t1이라고 하는 데이터 타입이 Print 인 변수(t1)에 담았다. 그럼 이 t1은 print 라는 클래스의 분신이라고 보면된다.
		// 2.그리고 t1에 내부적으로 delimiter 구분자의 값으로 "-"를 주면 이제부터 t1이라고하는 Print의 분신은 내부적으로 구분자의 값이 "-"가 되는 것이다.
		// 3.그럼 그 때 부터는 t1이 갖고 있는 a()메소드를 추출 할 때 더 이상 구분자를 추가하지 않아도 똑같은 동작이 된다. 
		// 이제부터 이줄은 저 위에 에 Print.a("-"); ~~ 두줄과 똑같이 동작을 한다.
		// 다만 위에있는 두 줄은 각가의 메소드 마다 구분자를 이렇게 인자값으로 줬어야한다. 하지만 이제는 그럴필요가없다.
		
		 // t1이라고하는 저 분신의 이름은 "인스턴스(instance)"라고한다. 즉 Print라는 클래스의 인스턴스인 t1이다 !!!!
		 // instance
		 Print t1 = new Print(); 
		 t1.delimiter = "-"; //t1의 delimiter 값이 "-"가 되면 인스턴스(t1)는 내부적으로 delimiter 값이 "-"인 것이다.
		 t1.a(); // 메소드가 인스턴스의 소속일때는 static을 빼주어야 한다. => 이전에 있는 코드는 메소드를 호출할 때마다 공통적인 상태인 구분자("-")를 넣어줬었는데 이제 메소드를 호출 할 때 그럴 필요가없다. 왜냐면 이 인스턴스는 내부적으로 delimiter라고 하는 변수의 값을 공유하기!! 때문에!!!
		 t1.b();
		 
		 //Print.a(); // 동작안함 왜냐하면 a라고하는 메소드는 클래스가 아니라 ★★★★인스턴스의소속!!!! 이기 때문에 동작안한다. public void a() 에 public과 void사이에 static이이제없다.
		 Print.c("$"); // Print의 소속인 c 호출 가능하다!!! 그 이유는 static 이기 때문이다. => public ""static"" void c(String delimiter) {
		 
		 
//		 Print.a("*");
//		 Print.b("*");
		 
		 Print t2 = new Print(); 
		 t2.delimiter = "*";
		 t2.a();
		 t2.b();
	}
	


	
	
}
