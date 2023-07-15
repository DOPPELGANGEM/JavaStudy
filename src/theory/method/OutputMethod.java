package theory.method;

public class OutputMethod {
	
	public static String a() {
		// ...
		return "a";
	}
	
	public static int one() { // 리턴값이 정수
		return 1;
		//...
		//return을 왜쓸까? 메소드의 결과값이 여기저기서 재사용할 수 있도록 하기 위해
	}
	
	public static void main(String[] args) { // void : 리턴값이없다
		
		System.out.println(a());
		System.out.println(one());

	}
}
