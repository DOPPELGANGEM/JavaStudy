package exercise.game;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String [] args) {
		
		// 가위바위보 게임
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("========== 가위바위보게임 ==========");
			System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
			int userNum = sc.nextInt();
			if (userNum == 1) {
				System.out.println("User : 가위");
			} else if (userNum == 2) {
				System.out.println("User : 바위");
			}else if (userNum == 3) {
				System.out.println("User : 보");
			} else {
				System.out.println("1~3사이의숫자만입력하세요.");
			}
			
			
			//컴퓨터
			int com = (int)((Math.random()*3)+1); //Math.random() => 0.0과 같거나 크고 1.0보다 작은값출력
			if(com == 1) {
				System.out.println("CPU : 가위");
			} else if(com == 2) {
				System.out.println("CPU : 바위");
			}	else if(com == 3) {
				System.out.println("CPU : 보");
			} 
			
			System.out.println("========== 결과 ==========");
			if(com == 1) {
				if(userNum == 1) {
					System.out.println("비겼습니다.");
				} else if (userNum == 2) {
					System.out.println("당신이 이겼습니다 ^^*");
				} else if (userNum == 3) {
					System.out.println("CPU가 이겼습니다.");
				}
			}
			
			if(com == 2) {
				if(userNum == 1) {
					System.out.println("CPU가 이겼습니다.");
				} else if (userNum == 2) {
					System.out.println("비겼습니다.");
				} else if (userNum == 3) {
					System.out.println("당신이 이겼습니다 ^^*");
				}
			}
			
			if(com == 3) {
				if(userNum == 1) {
					System.out.println("당신이 이겼습니다 ^^*");
				} else if (userNum == 2) {
					System.out.println("CPU가 이겼습니다.");
				} else if (userNum == 3) {
					System.out.println("비겼습니다.");
				}
			}
		}
		
		
	}
}
