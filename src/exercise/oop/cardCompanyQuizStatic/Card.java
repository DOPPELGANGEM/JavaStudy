package exercise.oop.cardCompanyQuizStatic;

public class Card {
	//★★★★★ static - class method ★★★★★ 
	//★★★★★ no static - instance method ★★★★★
	// static 변수(정적변수) :  메모리에 고정적으로 할당되어, 프로그램이 종료될 때 해제되는 변수
	// Static 메소드(정적 메소드) : 객체의 생성 없이 호출 가능, 객체에서는 호출이 가능은 하지만 지양한다.
	// static은 인스턴스 생성 상관없이 먼저 생성됨
	
	static int cardSerialNum = 1000; // cardSerialNum => 클래스소속(static)
	static int cardNumIncrement = 1000; // cardNumIncrement => 클래스소속(static)
	static String cardName; // cardName = > 클래스소속(static)
	
	public static void Card() { //Card는 클래스소속
		cardSerialNum++;
		cardNumIncrement = cardSerialNum; //static은 프로그램이종료될때 해제되고 메모리에할당이한번이라 1000박에안됨 ㅠㅠ
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		System.out.println("나를호출한 인스턴스 그녀석" + this);
		this.cardName = cardName;
	}
	
}