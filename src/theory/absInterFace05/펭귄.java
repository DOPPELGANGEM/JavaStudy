package theory.absInterFace05;

public class 펭귄 extends 조류 implements 물생활 {
	
	@Override
	void 먹기() {
		System.out.println("펭귄같이 먹는다.");
	}
	@Override
	void 소리내기() {
		System.out.println("펭귄소리를 낸다.");
	}
	@Override
	void 움직이기() {
		System.out.println("펭귄같이 움직인다.");
	}
	
	void 펭귄만가지는기능() {
		System.out.println("펭귄기능");
	}
	@Override
	public void 물에서동작() {
		System.out.println("펭귄이 물에서 생활");
		
	}
	
	
}
