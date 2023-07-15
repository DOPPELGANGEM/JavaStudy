package exercise.operator;

import java.util.Scanner;

public class LogicalOperator_03 {
	public static void main(String[] args ) 
	{
		// 자바 논리연산자 연습2번 2문제14
		
		// 2번
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 입력해주세요(A ~ Z) : ");
		String word = sc.next();
		
		String wordLower = word.toLowerCase(); // String 클래스 문자열 함수 toLowerCase()
		String wordUpper = word.toUpperCase(); // String 클래스 문자열 함수 toUpperCase()
		boolean wordCheck = true;
		
		if(word == wordUpper) {
			System.out.println(wordCheck);
		} else {
			System.out.println(!wordCheck);
		}
	}
	
}
