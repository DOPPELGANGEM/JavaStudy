package theory.This;


/* 2차원 좌표를 저장하기 위한 클래스 */


public class Point {
	
	int x = -1; 
	int y = -1; 
	
	Point(){ 
		System.out.println("디폴트 생성자");
		x = 0;
		y = 0; 
	}
	
	Point(/*Point this*/ int x, int y) {
		System.out.println("오버로딩된 생성자(int, int)");
//		x = x;
//		y = y;
		this.x = x; // 매개변수 x에 들어온 값을 현재 호출한 객체 x에담아라
		this.y = y; // 매개변수 y에 들어온 값을 현재 호출한 객체 x에담아라
	}
	
	String pointToString(/*Point this*/) { //자기자신을 참조할 수 있는 this라는 참조변수가 선언되엇다고볼 수 있다.(이것으로 각 객체를 구분한다는 것이다.)
		System.out.println("나를 호출한 객체:" + this); // this => pointToString 이라는 메서드를 호출한 객체가 누구인지를 알려주는 녀석 (멤버메서드에서는 자기자신을 참조할 수 있는 정보가들어간다.)
		return "[x="+x+" , y="+y+"]";
	}
	
	public void setX(/*Point this*/ int x) {
		this.x = x;
	}
	
	public void getY(/*Point this*/ int y) {
		this.y = y;
	}
	
	public int getX(/*Point this*/) {
		return this.x = x;
	}
	
	public int getY(/*Point this*/) {
		return this.y = y;
	}
}
