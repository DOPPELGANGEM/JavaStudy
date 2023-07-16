package practice.exception02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 0, result = 0;
		try {
			System.out.print("수 입력:");
			n1 = in.nextInt();
			System.out.print("수 입력:");
			n2 = in.nextInt();
			result = n1 / n2;
			System.out.printf("%d/%d=%d\n", n1, n2, result);
		} catch(InputMismatchException e) {
			System.out.println("입력 형식 예외!");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료!");
		
	}
}
