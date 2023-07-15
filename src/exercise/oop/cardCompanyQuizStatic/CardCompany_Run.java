package exercise.oop.cardCompanyQuizStatic;

public class CardCompany_Run {

	public static void main(String[] args) {
		
		
		Card shinHanCard = new Card(); // Card클래스에 sinHanCard 인스턴스
		shinHanCard.setCardName("신한카드"); // cardName도 static으로 선언해보긴했지만 this가 있어서 setCardName() 메서드에서는 Card.setCardName 이렇게 절대로 몼쓴다.(정적 컨텍스트에서는 사용할 수 없습니다.) 
		//Cannot use this in a static context 라고 뜹니다.

		System.out.println("카드이름(this:신한카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement ); // Card.cardNumIncrement으로 바뀌는 이유는 Card.cardNumIncrement는 클래스소속으로 실행되기때문이다.(나머지 3개도 마찬가지)
		
		System.out.println("===========================================================");
		
		Card nongHyupCard = new Card(); 
		nongHyupCard.setCardName("농협카드");
		System.out.println("카드이름(this:농협카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
		
		System.out.println("===========================================================");
		
		Card hanaCard = new Card(); 
		hanaCard.setCardName("하나카드");
		System.out.println("카드이름(this:하나카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
		
		System.out.println("===========================================================");
		
		Card bcCard = new Card(); 
		bcCard.setCardName("비씨카드");
		System.out.println("카드이름(this:비씨카드) : " + Card.cardName + ", 카드번호(cardNumIncrement => static이라 1000으로고정) : " + Card.cardNumIncrement );
		

	}
}