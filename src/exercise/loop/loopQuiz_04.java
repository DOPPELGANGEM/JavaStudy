package exercise.loop;

import java.util.Scanner;

public class loopQuiz_04 {
	public static void main(String[] args) {
		//4번
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 && num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요!");
		} else {
			for(int i = num1; i<= num2; i++) { //num1과 num2가 같아질때까지 후위연산한다?
				System.out.println(i);
			}
		}
		
	}
}
