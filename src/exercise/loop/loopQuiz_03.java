package exercise.loop;

import java.util.Scanner;

public class loopQuiz_03 {
	public static void main(String[] args) {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("무조건 1 이상의 숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum > 1) {
			int sum = 0;
			for(int i = 1; i <= inputNum; i++) {
				sum += i;
			}
			System.out.println("1부터" + inputNum + "까지의 합은" + sum + "입니다.");
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
}
