package theory.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
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
			e.printStackTrace();
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
