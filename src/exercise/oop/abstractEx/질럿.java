package exercise.oop.abstractEx;

public class 질럿 extends 프로토스 {
	
	@Override
	void 움직이기() {
		System.out.println("질럿같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("질럿은 미네랄 100원입니다.");
	}
	
	@Override
	void 베스핀가스필요() {
		System.out.println("질럿은 가스가 0원입니다.");
	}
	
	void 질럿만가지는기능(){
		System.out.println("칼로 적을 공격합니다.");
	}
	
	
}
