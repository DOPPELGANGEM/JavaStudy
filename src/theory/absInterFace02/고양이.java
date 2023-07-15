package theory.absInterFace02;

public class 고양이 extends 동물 { //고양이가 동물상속
	@Override
	void 먹기() {
		System.out.println("고양이 같이 먹는다.");
	}
	@Override
	void 소리내기() {
		System.out.println("고양이 소리를 낸다.");
	}
	@Override
	void 움직이기() {
		System.out.println("고양이 같이 움직인다.");
	}
	
	void 고양이만가지는기능() {
		System.out.println("고양이기능");
	}
	
}
