package theory.absInterFace05;

public class 상어 extends 어류 implements 물생활 {
	
	@Override
	void 먹기() {
		System.out.println("상어같이 먹는다.");
	}
	@Override
	void 소리내기() {
		System.out.println("상어소리를 낸다.");
	}
	@Override
	void 움직이기() {
		System.out.println("상어같이 움직인다.");
	}
	
	void 상어만가지는기능() {
		System.out.println("상어기능");
	}
	@Override
	public void 물에서동작() {
		System.out.println("상어가 물에서 생활");
		
	}
	
	
}
