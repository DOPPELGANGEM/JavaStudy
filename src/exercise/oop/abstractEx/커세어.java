package exercise.oop.abstractEx;

public class 커세어 extends 프로토스 implements 공중유닛 {
	@Override
	void 움직이기() {
		System.out.println("커세어같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("커세어은 미네랄 150원입니다.");
	}
	
	@Override
	void 베스핀가스필요() {
		System.out.println("커세어은 가스가 100원입니다.");
	}
	
	void 질럿만가지는기능(){
		System.out.println("삥삥섬광물질로 적을공경합니다.");
	}

	@Override
	public void 공중동작() {
		System.out.println("커세어가 공중에서 동작");
		
	}
}
