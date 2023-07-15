package exercise.oop.abstractEx;

public class 저글링 extends 저그 {
	@Override
	void 움직이기() {
		System.out.println("저글링같이 움직인다.");
	}
	
	@Override
	void 미네랄필요() {
		System.out.println("저글링은 미네랄 50원입니다.");
	}
	
	@Override
	void 베스핀가스필요(){
		System.out.println("저글링은 가스가 0 원입니다.");
	}
	
	void 저글링만가지는기능(){
		System.out.println("발톱으로 적을 공격합니다.");
	}
	
}
