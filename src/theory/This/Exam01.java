package theory.This;

public class Exam01 {
	public static void main(String[] args) {
		
		Point pos1 = new Point(10, 20);
		Point pos2 = new Point(30, 40);
		System.out.println("pos1:" + pos1); //pos1:examclass4.Point@7c30a502 => 객체에대한정보
		System.out.println("pos2:" + pos2); //pos2:examclass4.Point@49e4cb85 => 객체에대한정보
		System.out.println(pos1.pointToString(/*pos1참조변수*/)); //멤버메서드는 pointToString은 하나 객체는2개
		System.out.println(pos2.pointToString(/*pos2참조변수*/)); // pos1은 pos 1꺼로동작 ,pos2는 pos2꺼로동작
		
		// 멤버메서드를 호출할 때 pos1참조변수가 넘어간다. (내부적으로 동작)
	}
}
