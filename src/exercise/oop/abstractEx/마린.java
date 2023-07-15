package exercise.oop.abstractEx;

public class 마린 extends 테란 {
	@Override
	void 움직이기() {
		System.out.println("마린같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("마린은 미네랄 50원입니다.");
	}
	
	@Override
	void 베스핀가스필요(){
		System.out.println("마린은 가스가 0 원입니다.");
	}
	
	void 마린만가지는기능(){
		System.out.println("총으로 적을 공격합니다.");
	}
	
	
}
