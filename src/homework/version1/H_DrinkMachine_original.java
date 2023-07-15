package homework.version1;

import java.util.Scanner;

public class H_DrinkMachine_original {
	
	//1.자판기 프로그램을 구현한다. 자판기의 종류는 임의로 결정하며 아래와 같은 방식을 구현함.
	// 2.돈을 입력받음
	// 3.번호를 입력받으면 그에 맞는 상품이 출력. 여기서 재고관리를 해야하는데 재고가 없는 경우에는 “재고 없음”을 출력해준다.
	// 4.이외의 실제 자판기에서 나올법한 예외들 ex)잔액 부족, 잔돈반환 등등을 처리함
	// 5.이 내용까지가 자판기 사용자에 대한 부분이고 돈을 넣을때, 지정해 놓은 돈을 입력하면 ex) 자판기 관리자 “한창희” 메뉴로 넘어간다.
	
	// 자판기관리자 기능
	// 1.자판기 음료를 변경하는 기능
	// 2.자판기 음료의 가격을 변경하는 기능
	// 3.자판기 음료의 재고를 추가하는 기능
	// 4.자판기 음료를 추가하는 기능
	// 5.현재까지 음료자판기에 들어오는 수익을 출력하는기능

	public static final int MAX = 10; // 음료종류의 최대갯수 (static:정적변수로 메모리에 고정적으로 할당되어, 프로그램이종료될때 해제된다.)
	
	// 전역변수 선언
	static String[] drink = new String[MAX]; 
	static int[] price = new int[MAX];
	static int[] stock = new int[MAX]; // 재고
	static int count = 3; //메뉴의 갯수
	static int admin = 1004; // 관리자메뉴로가는 비밀번호
	static int sales = 0; //총 수익
	static Scanner sc = new Scanner(System.in);
	
	// 자판기 초기화
	public static void reset() {
		drink[0] = "코카콜라";
		price[0] = 1000;
		stock[0] = 3;
		drink[1] = "펩시콜라";
		price[1] = 1500;
		stock[1] = 3;
		drink[2] = "칠성사이다";
		price[2] = 2000;
		stock[2] = 3;
	}
	
	// 자판기 유저의 인터페이스 담당함수
	public static void user() {
		Boolean first = true;
		int money = 0;
		while(true) {
			System.out.println("음료수 자판기 입니다. (번호:상품(재고))");
			System.out.println("==================================================");
			
			// 처음에만 돈을 입력받고 잔돈 반환 전 까지는 돈을 입력받지 않음.
			if(first) {
				System.out.print("돈을 넣어주세요(관리자라면 비밀번호를 입력해주세요.) : ");
				money = sc.nextInt();
				first = false;
			}
			
			// 관리자 비밀번호는 1004, 입력하면 관리자 함수로 넘어감.
			if(money == 1004) {
				admin(); //관리자함수
				return;
			}
			
			System.out.print("메뉴 입력:");
			int num = sc.nextInt();
			
			if(money >= price[num-1]) {
				if(stock[num-1] > 0) {
					money = money - price[num-1];
					stock[num-1]--;
					sales += price[num-1];
					System.out.println(drink[num-1] + " 음료로 선택하셨습니다.");
				} else {
					System.out.println("현재 재고가 없습니다!");
					continue; // continue문은 해당 조건문만 실행하지 않고 반복문은 이어서 실행하는제어문
				}
			}
			else {
				System.out.println("잔액이 부족합니다!");
			}
			
			System.out.println("잔액 : " + money);
			
			//모든 돈을 사용하면 이용 종료 후 초기화면 진입
			if(money == 0) {
				System.out.println("남은돈이 없습니다. 다음에 또 이용해주세요~~!");
				first = true;
				continue;
			}
			
			//돈이 남아 있다면 선택지를 준다.
			System.out.println("1.계속 구매하기 2:금액 추가하기 3:잔돈반환하기");
			System.out.print("번호를 입력하세요:");
			int optionNum = sc.nextInt();
			
			if(optionNum == 1) {
				continue;
			} else if (optionNum == 2) {
				System.out.print("돈을 넣어주세요 : ");
				int addAmount = sc.nextInt();
				money += addAmount;
				System.out.println("금액이 추가되었습니다! 잔액 : " + money);
			} else if (optionNum == 3) {
				System.out.println("거스름돈" + money + "원이 반환됩니다.");
				System.out.println("감사합니다! 다음에 또 이용해주세요!!");
				first = true;
			}
		}	
	}
	
	// 관리자페이지
	public static void admin() {
		while(true) {
			System.out.println("==================================================");
			System.out.println("자판기 관리자 한창희 페이지 입니다.");
			System.out.println("1: 메뉴 변경 , 2: 가격변경, 3: 재고추가, 4:메뉴추가 5: 수익확인(종료)");
			System.out.print("번호를 입력해 주세요: ");
			int num = sc.nextInt();
			System.out.println("==================================================");
			
			// 1.메뉴변경
			if(num == 1) {
				System.out.print("변경하실 메뉴의 번호를 입력하세요(1 ~ " + count + "번중에 선택하세요(1.코카콜라(1000원), 2.펩시콜라(1500원), 3.칠성사이다(2000원) : ");
				int i = sc.nextInt();
				System.out.print(drink[i-1] + "를(을) 무엇으로 바꾸시겠습니까? : ");
				sc.nextLine();
				String name = sc.next();
				System.out.print(name + "의 가격은 얼마입니까?");
				int v = sc.nextInt();
				System.out.printf(name + "의 재고를 몇 개 등록하시겠습니까? : ");
				int n = sc.nextInt();
				
				drink[i-1] = name;
				price[i-1] = v;
				stock[i-1] = n;
				System.out.println("메뉴 변경이 완료되었습니다.");
				//System.out.println(name);
				//System.out.println(v);
				//System.out.println(n);
			}
			
			// 2.가격변경
			else if(num == 2) {
				System.out.print("가격을 변경하실 메뉴의 번호를 입력하세요 1 ~ " + count + "번중에 선택하세요(1.코카콜라(1000원), 2.펩시콜라(1500원), 3.칠성사이다(2000원) : ");
				int i = sc.nextInt();
				System.out.print(drink[i-1] + "의 가격을 얼마로 바꾸시겠습니까? :");
				int j = sc.nextInt();
				price[i-1] = j;
				System.out.println("가격 변경이 완료되었습니다.");
				//System.out.println(price[i-1]);
			}
			
			// 3.재고추가
			else if(num == 3) {
				System.out.print("재고를 추가하실 메뉴의 번호를 입력하세요1 ~" + count + "번중에 선택하세요(1.코카콜라(1000원), 2.펩시콜라(1500원), 3.칠성사이다(2000원) : " );
				int i = sc.nextInt();
				System.out.print(drink[i-1] + "를(을) 몇개 추가 하시겠습니까? :");
				int j = sc.nextInt();
				stock[i-1] += j;
				System.out.println("재고 추가가 완료되었습니다.");
//				System.out.println(i);
//				System.out.println(j);
			}
			
			// 4.메뉴추가
			else if (num == 4) {
				if(count >= MAX - 1) {
					System.out.println("더 이상 메뉴가 들어갈 자리가 없습니다!");
					continue;
				}
				else {
					System.out.print("추가하실 메뉴의 가격을 입력하세요 : ");
					int i = sc.nextInt();
					System.out.print("추가하실 메뉴의 이름을 입력하세요 :");
					sc.nextLine();
					String name = sc.next();
					System.out.print(name + "의 재고는 몇 개 입니까?");
					int j = sc.nextInt();
					
					drink[count] = name;
					price[count] = i;
					stock[count] = j;
					count++;
					System.out.println("메뉴추가가 완료되었습니다.");
					
					System.out.println(name);
					System.out.println(i);
					System.out.println(j);
				}
			}
			
			// 5.수익 확인
			else if(num == 5) {
				System.out.println("현재까지의 수익은 " + sales + "입니다.");
			}
			// -1 을 입력하면 다시 자판기 메뉴로 돌아간다.
			else if(num == -1) {
				user();
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		reset();
		user();
		return;
	}
}