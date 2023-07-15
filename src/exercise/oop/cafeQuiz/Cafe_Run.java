package exercise.oop.cafeQuiz;

public class Cafe_Run {
	public static void main(String[] args) {
//		Q5. 아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. '06-2 객체간 협력'을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.
		
		//카페 객체(별다방, 콩다방)
		//커피 객체(4000원짜리 아메리카노, 4500원짜리 아메리카노)
		
		Cafe starCafe = new Cafe("김 씨(Cafe라는 클래스의 인스턴스 starCafe)","별다방",4000,"아메리카노"); //별다방 4000 아메리카노 
		Cafe kongCafe = new Cafe("이 씨(Cafe라는 클래스의 인스턴스 kongCafe)","콩다방",4500,"아메리카노"); //콩다방 4500 아메리카노

//		System.out.println("김 씨는 별다방 4000원짜리 아메리카노를 주문했고 이 씨는 콩다방에서 4500원짜리 아메리카노를 주문했습니다.  ");
		System.out.println(starCafe.CafeToName());
		System.out.println("==========================");
		System.out.println(kongCafe.CafeToName());
	}
}
