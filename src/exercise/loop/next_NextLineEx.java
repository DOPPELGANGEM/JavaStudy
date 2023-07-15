package exercise.loop;

import java.util.Scanner;

public class next_NextLineEx {

	public static void main(String[] args) {
		// https://velog.io/@suyyeon/JAVA-Scanner%ED%81%B4%EB%9E%98%EC%8A%A4-next-nextLine-%EC%B0%A8%EC%9D%B4
		// next() 와 nextLine() 차이
		
		
		// next() 
		// 공백을 기준으로 한단어또는 한문자씩입력받음
		// 버퍼에 입력된 문자나 문자열에서 공백 전 까지의 단어를 읽는다.
		// 개행문자를 가져오지않는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("1.문자를 입력하세요 : ");
		String str1 = scan.next();
		System.out.println(str1);

		// nextLine()
		// 문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.
		// 버퍼에 입력된 문자열을 개행 문자까지 다 가져온다.
		Scanner scan2 = new Scanner(System.in);
		System.out.print("2.문자를 입력하세요 : ");
		String str2 = scan2.nextLine();
		System.out.println(str2);
	}

}
