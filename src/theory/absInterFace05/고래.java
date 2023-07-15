package theory.absInterFace05;

public class 고래 extends 포유류 implements 물생활  {
	
	@Override
	void 먹기() {
		System.out.println("고래같이 먹는다.");
	}
	@Override
	void 소리내기() {
		System.out.println("고래소리를 낸다.");
	}
	@Override
	void 움직이기() {
		System.out.println("고래같이 움직인다.");
	}
	
	void 고래만가지는기능() {
		System.out.println("고래기능");
	}
	@Override
	public void 물에서동작() {
		System.out.println("고래가 물에서 생활");
		
	}
	
	
}
