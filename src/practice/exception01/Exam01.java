package practice.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		// 예외가 발생되면 해당 예외로 정의되어 있는 Exception 객체 생성
		// 예외 객체가 생성되면 JVM은 프로그램을 종료
		
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 0, result = 0;
		System.out.print("수 입력:");
		
		try {
			n1 = in.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("입력 형식 예외!");
			e.printStackTrace();
		}
		System.out.print("수 입력:");
		try {
			n2 = in.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("입력 형식 예외!");
			e.printStackTrace(); //java.util.InputMismatchException 출력해주는거
		}
		
		try {
			result = n1 / n2;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.printf("%d/%d=%d\n", n1, n2, result);
		
		
	}
}
