package exercise.oop.abstractEx;

public class 뮤탈리스크 extends 저그 implements 공중유닛 {
	@Override
	void 움직이기() {
		System.out.println("뮤탈리스크같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("뮤탈리스크은 미네랄 100원입니다.");
	}
	
	@Override
	void 베스핀가스필요(){
		System.out.println("뮤탈리스크은 가스가 100원입니다.");
	}
	
	void 뮤탈리스크가지는기능(){
		System.out.println("적에게 산성스프레이 공격합니다.");
	}

	@Override
	public void 공중동작() {
		System.out.println("뮤탈리스크가 공중에서 동작");
		
	}
}
