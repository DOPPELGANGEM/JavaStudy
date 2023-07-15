package practice.superEx;

public class Truck extends Car {
	public Truck() {
		//super(); //부모의 생성자를 이야기한다.
		super("소방차");
		System.out.println("Truck의 기본생성자입니다.");
	}
}
