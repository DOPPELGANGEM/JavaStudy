package exercise.operator;

public class Operator {
	
	public static void main(String[] args) 
	{
		// 자바의 연산자 
		
		// 1. 정수형 변수 a,b,c 3개를 만든 후 각각 10,20,30을 입력받아, 다음 연산을 수행하는 식을 작성하고 a,b,c의 결과값을 출력하세요.
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++; // a= 10;
		// a = 11, b=20, c = 30
		b = (--a) + b; // b = 10 + 20
		// a = 10, b = 30, c = 30
		c = (a++)+(--b); // c = 10 + 29
		// 최종 a = 11 , b = 29, c = 39
		System.out.println("a의 값 : " + a + ", b의 값 : " + b + ",c의 값 :" + c);
		
		// 2. 논리형 변수 flag를 true 초기화 하고 다음 연산을 수행하고 결과값을 확인해보세요.
		boolean flag = true;
		System.out.println(!!!!flag);
		
		// 3. 정수형 변수 x = 100, y = 33, z = 0 초기화후에 다음 연산수행후 x,y,z를 출력하세요
		int x = 100;
		int y = 33;
		int z = 0;
		x--; // x = 100, y= 33, z = 0;
		// x = 99, y = 33, z = 0
		z = x-- + --y; // z = 99 + 32
		// x = 98 , y = 32, z = 131
		x = 99 + x++ +x; // 99 + 98 + 99
		// x = 296, y = 32, z = 131
		y = y-- + y + ++y; // 32 + 31 + 32
		// 최종 x = 296, y = 95, z = 131
		System.out.println("x의 값 : " + x + ", y의 값 : " + y + ", z의 값 : " + z);
		
		
	}
}
