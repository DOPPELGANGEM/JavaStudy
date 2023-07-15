package exercise.loop;

import java.util.Scanner;

public class loopQuiz_05 {
	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 출력할 숫자를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		System.out.print("==" + dan + "단 == \n");
		
		for(int i=1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	

	}
}
