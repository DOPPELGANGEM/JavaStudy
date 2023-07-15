package theory.method;

class Greeting {
// public, protected, default, 
// private : 같은클래스내에서만 사용할수 있음
	
}

public class AccessLevelModifiersMethod {
	
	private static void hi() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		hi();
	}
	
}
