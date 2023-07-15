package exercise.operator;

import java.util.Scanner;

public class IF_StudentScore {
	public static void main(String[] args) {
		//점수와 학년을 입력 받아 60점 이상이면 합격,
		//미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 학년을 입력해주세요. : ");
		int grade = sc.nextInt();
		System.out.print("학생의 점수를 입력하세요. : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			if(grade != 4) {
				System.out.println("4학년이 아니고 60점이상이라 합격!");
			}
			else if (score >= 70) {
				System.out.println("4학년이고 70점이상이어서 합격!");
			}
			else {
				System.out.println("4학년이고 70점 이하여서 불합격");
			}
		}
		else {
			System.out.println("60점이하는 모든학년 불합격");
		}
		
		
		
		

	}
}
