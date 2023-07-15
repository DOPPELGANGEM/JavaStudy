package homework.version2;

// -- 실행로직 --
// 유저객체와 자판기객체를만들어서 자판기에 다음과같은기능들을 추가해 구현해본다.
// 1.음료선택메뉴판
// 2.내가넣은 돈입력
// 3.자판기가 나에게 줄 잔돈 반환

public class DrinkMachine_Run {
	public static void main(String[] args) {
		

		DrinkMachine dm = new DrinkMachine();
		dm.menu();
		dm.inputMoney(1500);
		dm.changeMoney(dm.drinkSelect(dm.CIDER));
		
		

	}
}



/* Getter와 Setter을 쓰는이유 => 객체지향에서 이야기하는 **캡슐화**를 달성하기 위함
 * 
 * 예를들어, 클래스 멤버변수를 public이 아닌 private으로 설정한 다음 setter 메서드를 구현하지 않고 getter 메서드만 구현하면, 외부에서는 그 변수에 접근해서 오로지 ""읽기""만 가능(read-only)""하도록 만들어 줄 수 있다. 또한 setter 메서드를 이용하면 외부에서 할당하는 값에 조건을 설정하여 프로그램의 안전성을 높여줄수 도 있다.
 * (private을 통해 불필요한 정보, 즉 외부에서 알 필요가없거나 알아서는 안되는 정보를 숨기는 것도 객체지향에서 말하는 추상화중 하나!)
 * 
 * https://velog.io/@jipark09/Java-%EA%B0%84%EB%8B%A8%ED%95%98%EA%B2%8C-%EC%9E%90%ED%8C%90%EA%B8%B0VendingMachine-%EA%B0%9D%EC%B2%B4-%EC%83%9D%EC%84%B1%ED%95%98%EA%B8%B0
 * https://charliecharlie.tistory.com/364
 * 
 * java.lang 패키지의 Object클래스의 toString 메서드
 * toString 메서드 : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메서드
 * 둘이 동일
		System.out.println(dm);
		System.out.println(dm.toString());
 * 
 * 객체 출력시 자바 컴파일러가 자동으로 toString() 메소드 호출 => 추후정리..
 * 
 * 
 * 
 * 
 * getter 메소드 => 필드가 가지고 있는 값을 가지고 올 수 있게 해준다.(return값을 줘야함)
 * 	setter 메소드  =>  전달값을 받아서 메소드 안에서 쓸 수 있게 해주는게 매개변수이다.
 */