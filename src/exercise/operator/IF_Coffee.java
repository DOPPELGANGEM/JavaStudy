package exercise.operator;

import java.util.Scanner;

public class IF_Coffee {
	public static void main(String[] args) {
		//switch 문을 이용해서 커피 메뉴의 가격을 알려주는 프로그램을 작성해라.
		// 에스프레소, 카푸치노, 카페라떼는 3500원이고 아메리카노는 2000원이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("커피메뉴 이름을 적어주세요 : ");
		String coffeeMenu = sc.next();
		int price = 0;
		switch(coffeeMenu) {
			case  "에스프레소" :
				System.out.println("에스프레소는 3500원 입니다.");
				break;
			
			case "카푸치노" :
				System.out.println("카푸치노는 3500원 입니다.");
				break;
			
			case "카페라떼" :
				System.out.println("카페라떼는 3500원 입니다.");
				break;
			
			case "아메리카노" :
				System.out.println("아메리카노는 2000원 입니다.");
				break;
			
			default :
				System.out.println("해당메뉴는 없는 메뉴입니다.");
		}
		
		
		
	}
}
