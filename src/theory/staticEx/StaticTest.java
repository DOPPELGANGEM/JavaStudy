package theory.staticEx;

class miniPrint {
	
	static int a = 1; //static 변수
	int b = 2; //non-static 변수
	
	
	public static void staticTest() {
		System.out.println("static 클래스소속 : ~~");
		System.out.println("1");
	}
	
	public void nonStaticTest() {
		System.out.println("non-static 인스턴스소속 : ~~");
		System.out.println("2");
	}
	
}

public class StaticTest {
	public static void main(String[] args) { 
		System.out.println(new miniPrint().a);
		System.out.println(new miniPrint().b);
		
		miniPrint print1 = new miniPrint();
		//Print.staticTest(); 
		print1.staticTest(); 
		
	
		miniPrint print2 = new miniPrint();
		print2.nonStaticTest(); 
	
	}
}
