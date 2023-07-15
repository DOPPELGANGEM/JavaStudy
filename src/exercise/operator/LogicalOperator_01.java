package exercise.operator;

public class LogicalOperator_01 {
	public static void main(String[] args ) 
	{
		// 자바 논리연산자 연습1번 2문제
		
		// 1. 50, 30을 입력받아 다음과 같은 식을 작성하였을때 결과값을 예상해보고 출력해보자.
		int a = 50;
		int b = 30;
		
		System.out.println(a!= b && a < b); // false
		System.out.println(a < b || a == b); // false
		System.out.println(a > b && a != b); // true
		System.out.println(a > b || a == b); // true
		
		// 2.70,55을 c,d로 입력받아 다음과 같은 식을 작성하였을 때 결과값을 예상해보고 출력해보자.
		int c = 70;
		int d = 55;
		System.out.println(c == d || c++<100); //true
		// c = 71, d = 55,
		System.out.println(c < d && --d < 55); // false
		// c = 71 , d = 54
		System.out.println(c != d && c-- < d++); // false
		// c = 70 , d = 55
		System.out.println(c++ != d || d++ >= 85); //true
		// 최종 c = 71 , d = 56 
		System.out.println("c의 값 : " + c + ", d의 값 : " + d);
	}
}
