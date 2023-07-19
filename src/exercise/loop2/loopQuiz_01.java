package exercise.loop2;

import java.util.Scanner;

public class loopQuiz_01 {
	public static void main(String[] args) {
		// 1번
	  // 1부터 사용자에게 입력 받은 수까지 중에서
	  // 1) 2와 3의 배수를 모두 출력하고
	  // 2) 2와 3의 공배수의 개수를 출력하세요.
		
		// 공배수 : 두 개(또는 그 이상)의 자연수의 공통인 배수를 그들 수의 공배수라고 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		int inputNum = sc.nextInt();
		
		for(int i = 0; i <= inputNum; i++) {
			if(i % 2 == 0) {
				System.out.println("2의 배수 : " + i);
			}
		}
		
		for(int j = 0; j <= inputNum; j++) {
			if(j % 3 == 0) {
				System.out.println("3의 배수 : " + j);
			}
		}
		
		
		for(int k = 0; k <= inputNum; k++) {
			if(k % 2 == 0 && k % 3 == 0) {
				System.out.println("2와 3의공배수 : " + k);
			}
		}
		
	}
}
