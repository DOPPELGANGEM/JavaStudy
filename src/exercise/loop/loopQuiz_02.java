package exercise.loop;

import java.util.Scanner;

public class loopQuiz_02 {
	public static void main(String[] args) {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
    //단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum >= 1) {
			for(int i = inputNum; i >= 1; i--) {
				System.out.print(i  + " ");
			}
		} else {
			System.out.println("무조건 1보다는 크거나 같아야합니다.");
		}
	}
}
