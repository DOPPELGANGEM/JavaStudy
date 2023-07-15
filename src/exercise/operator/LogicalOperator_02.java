package exercise.operator;

import java.util.Scanner;

public class LogicalOperator_02 {
	public static void main(String[] args ) 
	{
		// 자바 논리연산자 연습2번 2문제
		
		// 1번
		// 입력한 정수가 1 ~ 100사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? true
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 (1 ~ 100) : ");
		int num = sc.nextInt(); // nextInt() : int를 읽음
		
		boolean numBool = (num > 1) && (num < 100);
		if (numBool) {
			System.out.println(numBool);
		} else {
			System.out.println(numBool);
		}
		
	}
}
