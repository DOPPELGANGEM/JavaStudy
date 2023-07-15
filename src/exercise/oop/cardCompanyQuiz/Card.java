package exercise.oop.cardCompanyQuiz;

public class Card {
	//★★★★★ static - class method ★★★★★ 
	//★★★★★ no static - instance method ★★★★★
	// static은 인스턴스 생성 상관없이 먼저 생성됨
	
	static int cardSerialNum = 1000;
	int cardNumIncrement;
	String cardName;
	
	public Card() {
		cardSerialNum++;
		cardNumIncrement = cardSerialNum;
	}
	
//getter 메서드 가져오는것
	//접근제한자 : public
	//리턴타입 :필드의 리턴타입
	//메소드 이름 : get+필드이름(첫문자는 대문자)
	//리턴값:필드값
	public String getCardName() {
		return cardName;
	}
	
	//setter 메소드 메서드 설정하는것
	// 접근제한자 : public
	// 리턴타입 : void
	// 메소드이름 : set + 필드이름(첫문자는대문자)
	// 매개변수타입 : 필드타입
	// 만약필드타입이 불리언이면 Getter는 get으로 시작하지않고 is로 시작하는것이관례
	public void setCardName(String cardName) {
		System.out.println("나를호출한 인스턴스 그녀석" + this);
		this.cardName = cardName;
	}
	
}




//package oop.cardcompany;
//
//public class Card {
//	//★★★★★ static - class method ★★★★★ 
//	//★★★★★ no static - instance method ★★★★★
//	// static 변수(정적변수) :  메모리에 고정적으로 할당되어, 프로그램이 종료될 때 해제되는 변수
//	// Static 메소드(정적 메소드) : 객체의 생성 없이 호출 가능, 객체에서는 호출이 가능은 하지만 지양한다.
//	// static은 인스턴스 생성 상관없이 먼저 생성됨
//	
//	static int cardSerialNum = 1000; // cardSerialNum => 클래스소속(static)
//	static int cardNumIncrement = 1000; // cardNumIncrement => 클래스소속(static)
//	static String cardName; // cardName = > 클래스소속(static)
//	
//	public static void Card() { //Card는 클래스소속
//		cardSerialNum++;
//		cardNumIncrement = cardSerialNum; //static은 프로그램이종료될때 해제되고 메모리에할당이한번이라 1000박에안됨 ㅠㅠ
//	}
//	
//	public String getCardName() {
//		return cardName;
//	}
//	
//	public void setCardName(String cardName) {
//		System.out.println("나를호출한 인스턴스 그녀석" + this);
//		this.cardName = cardName;
//	}
//	
//}