package exercise.array;

import java.util.Scanner;

public class ArrayQuiz_03 {
	public static void main(String[] args) {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열크기를 할당할 숫자를 입력해주세요 : ");
		int input = sc.nextInt();
		int[] arrSize  = new int[input];
			
			for(int i = 0; i <= (arrSize.length-1); i++) {
				arrSize[i] = i+1;
				System.out.print(arrSize[i] + " ");
			}
		}
	}

