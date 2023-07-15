package theory.polymorphism;

public class Main {
	public static void main(String[] args) {
	//부모클래스의 참조변수는 자식 객체를 참조할 수 있음(다형성)
		TestA oba = new TestA();
		TestA obb = new TestB(); // 업캐스팅(업캐스팅이된녀석은 다운캐스팅가능) :자식 클래스의 객체가 부모 클래스 타입으로 형변환 되는 것
		TestA obc = new TestC();
		
		// 부모타입의 참조변수로 참조했지만 A메서드를 호출했을때 A의기능이나온다.
		//여러타입의 객체를 하나의 타입으로 관리할 수 있다. 그 하나의 타입으로 여러객체를 관리하더라도 실행형태가 정의된 모양대로 서로 달라질 수 있다. 이게 엄청난 강점이다!
		// ☆ 객체가 변한 것이 아니라 참조변수의 타입에 따라 참조하는 객체의 볼 수 있는 멤버의 범위가 다른 것 
		
		oba.methodA();
		obb.methodA(); //재정의 된 자식 메서드가 호출(동적바인딩)  // 분명히 B의 내용이 있는데 안보임. obb를통해서 왜? 참조하고 있는 타입이 A타입이라그런다.
		obc.methodA();
		
		TestA[] ob = new TestA[] {oba, obb, obc}; //하나의타입으로 묶어줄 수 있다.
		for(int i = 0; i < ob.length; i++) {
			// 하나의 타입으로 여러 타입의 객체를 관리하는것이다.
			// oba가 methodA()를 호출했을 때 A
			// obb가 methodA()를 호출했을 때 BA
			// obc가 methodA()를 호출했을 때 CA => 다 다르게 나올수 있다.(이게바로 다형성이라는 특징)
			ob[i].methodA(); 
		}
		
		System.out.println("----------");
		
		TestB tmp = (TestB)obb; // 다운캐스팅 => obb라는 참조변수가 A객체인지 B객체인지 알수가없어서 그래서 자료형을 명시꼭해야된다. (TestB) 
		System.out.println(tmp); // 참조값동일
		System.out.println(obb); // 참조값동일
		tmp.methodB(); //다운캐스팅 후 자식 멤버 사용가능
		
		//instanceof : 객체가 어떤 타입으로부터 만들어졋는지확인해볼 수 있는 연산자
		System.out.println(obb instanceof TestA); //obb가 TestA로만들어진 객체냐? (obb가 참조하고 있는객체를 어떤 타입으로 형변환이가능한지 확인해볼수 있다. true,false형식으로 나온다.)
		System.out.println(obb instanceof TestC); //obb가 TestC로만들어진 객체냐?
		
		
		for(int i = 0; i < ob.length; i++) {
			ob[i].methodA(); 
			if(ob[i] instanceof TestB) {
				TestB b = (TestB)ob[i]; //다운캐스팅해라!
				b.methodB();//그리고 그 b를가지고 자식멤버를 활용해라
			} else if(ob[i] instanceof TestC) {
				TestC c = (TestC)ob[i];
				c.methodC();
			}
		}
		System.out.println("----------");
		
		
		
		
	}
}
