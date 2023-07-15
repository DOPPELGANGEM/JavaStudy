package theory.absInterFace02;

public class 개 extends 동물 { //개가 동물 상속 => 
	
	@Override
	void 먹기() {
		System.out.println("개같이 먹는다.");
	}
	@Override
	void 소리내기() {
		System.out.println("개소리를 낸다.");
	}
	@Override
	void 움직이기() {
		System.out.println("개같이 움직인다.");
	}
	
	void 개만가지는기능() {
		System.out.println("개기능");
	}
	
	
}
