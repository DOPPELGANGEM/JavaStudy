package exercise.oop.abstractEx;

// 추상 : 형태가 정해지지않은것
abstract public class 스타크래프트 { // 추상클래스
	
	abstract void 움직이기();  // 추상메서드
	abstract void 미네랄필요();
	abstract void 베스핀가스필요();
	
	// void 움직이기(); => 움직이기라는 메서드는 있는데 어떻게 동작할지는 명확하게정의하지않았다.
	// 이런 추상메서드를 가지는 클래스는 반드시 추상클래스여야함!
}
