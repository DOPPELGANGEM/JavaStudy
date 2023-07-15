package exercise.loop;

import java.util.Scanner;

public class loopQuiz_06 {
	public static void main(String[] args) {
		//6번  
    //사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
    //단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 출력할 숫자를 입력해주세요(9단까지만입력!) : ");
		int dan = sc.nextInt();
		
		System.out.print("==" + dan + "단 == \n");
		if(dan < 9) {
			for(int i = 1; i <= 20; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
		} else {
			System.out.println("9이하의 숫자만 입력해주세요!");
		}
	}
}
