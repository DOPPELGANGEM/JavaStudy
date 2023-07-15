package theory.polymorphism;

public class TestB extends TestA {
	//Override (재정의)
	@Override
	void methodA() { // 재정의를 한다는 것은 좁아지면안된다. ex)private 안된다. 똑같거나 더넓어야함
		System.out.println("BA");
	}
	void methodB() { // A가 갖고있는 기능을 재정의한다.
		System.out.println("B");
	}
}
