package exercise.oop.abstractEx;

public class 레이스 extends 테란 implements 공중유닛 {
	@Override
	void 움직이기() {
		System.out.println("레이스같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("레이스는 미네랄 150원입니다.");
	}
	
	@Override
	void 베스핀가스필요(){
		System.out.println("레이스은 가스가 100원입니다.");
	}
	
	void 레이스만가지는기능(){
		System.out.println("지상은 레이저공격 공중은 미사일공격합니다.");
	}

	@Override
	public void 공중동작() {
		System.out.println("레이스가 공중에서 동작");
		
	}
}
