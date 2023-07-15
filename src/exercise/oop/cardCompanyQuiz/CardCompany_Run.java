package exercise.oop.cardCompanyQuiz;

public class CardCompany_Run {
//	Q6. 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. 06-3의 <학번 생성하기> 예제를 참고하여 
//	카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성해보세요.
	
	public static void main(String[] args) {
		
		//카드이름(신한카드,농협카드,하나카드,BC카드)
		//카드번호증가
		Card shinHanCard = new Card(); // Card클래스에 sinHanCard 인스턴스
		shinHanCard.setCardName("신한카드");
		System.out.println("카드이름(this:신한카드) : " + shinHanCard.cardName + ", 카드번호 : " + shinHanCard.cardNumIncrement );
		
		System.out.println("===========================================================");
		
		Card nongHyupCard = new Card(); // Card클래스에 nongHyupCard 인스턴스
		nongHyupCard.setCardName("농협카드");
		System.out.println("카드이름(this:농협카드) : " + nongHyupCard.cardName + ", 카드번호 : " + nongHyupCard.cardNumIncrement );
		
		System.out.println("===========================================================");
		
		Card hanaCard = new Card(); // Card클래스에 hanaCard 인스턴스
		hanaCard.setCardName("하나카드");
		System.out.println("카드이름(this:하나카드) : " + hanaCard.cardName + ", 카드번호 : " + hanaCard.cardNumIncrement );
		
		System.out.println("===========================================================");
		
		Card bcCard = new Card(); // Card클래스에 hanaCard 인스턴스
		bcCard.setCardName("비씨카드");
		System.out.println("카드이름(this:비씨카드) : " + bcCard.cardName + ", 카드번호 : " + bcCard.cardNumIncrement );
		

	}
}




//package oop.cardcompany;
//
//public class CardCompany_Run {
//
//	public static void main(String[] args) {
//		
//		
//		Card shinHanCard = new Card(); // Card클래스에 sinHanCard 인스턴스
//		shinHanCard.setCardName("신한카드"); // cardName도 static으로 선언해보긴했지만 this가 있어서 setCardName() 메서드에서는 Card.setCardName 이렇게 절대로 몼쓴다.(정적 컨텍스트에서는 사용할 수 없습니다.) 
//		//Cannot use this in a static context 라고 뜹니다.
//
//		System.out.println("카드이름(this:신한카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement ); // Card.cardNumIncrement으로 바뀌는 이유는 Card.cardNumIncrement는 클래스소속으로 실행되기때문이다.(나머지 3개도 마찬가지)
//		
//		System.out.println("===========================================================");
//		
//		Card nongHyupCard = new Card(); 
//		nongHyupCard.setCardName("농협카드");
//		System.out.println("카드이름(this:농협카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
//		
//		System.out.println("===========================================================");
//		
//		Card hanaCard = new Card(); 
//		hanaCard.setCardName("하나카드");
//		System.out.println("카드이름(this:하나카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
//		
//		System.out.println("===========================================================");
//		
//		Card bcCard = new Card(); 
//		bcCard.setCardName("비씨카드");
//		System.out.println("카드이름(this:비씨카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
//		
//
//	}
//}