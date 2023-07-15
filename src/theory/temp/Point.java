package theory.temp;

/*
 * 2차원 좌표를 저장하기위한 클래스
 * 
 * 접근제한자
 * 클래스(객체) 멤버에 대한 접근을 제한하는 키워드
 * private: 클래스 내부에서만 직접 접근이 가능
 * public: 어디서든 접근이 가능
 * protected: default + 상속 관계일 때 직접 접근 가능
 * default(선언없음): 동일한 패키지 범위까지 접근 가능
 * 
 * private 멤버에 대한 접근이 가능하도록 해주는 메서드
 * 	setter:값을 설정하는 메서드
 * 	getter:값을 반환하는 메서드
 * 
 * */

public class Point {
	//클래스는 멤버필드와 멤버메서드를 갖는다
	
	//멤버필드
	private int x = -1; //직접초기화
	private int y = -1; 
	
	public void setX(int n) {
		x = n;
	}
	
	public void setY(int n) {
		y = n;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	{ // 블록초기화
		System.out.println("초기화 블록");
		x = 1;
		for(int i = x; i < 10; i++) {
			y += x;
		}
	}
	
	public Point(){ //디폴트 생성자 => 객체생성시 반드시 호출이되게 되어있다.(초기화하기위한목적!)
		System.out.println("디폴트 생성자");
		x = 0;
		y = 0; //멤버필드의 변수를 초기화 하는 것이다.
	}
	
	public Point(int n1, int n2) {
		System.out.println("오버로딩된 생성자(int, int)");
		x = n1;
		y = n2;
	}
	
	//멤버메서드
	public String pointToString() {
		return "[x="+x+" , y="+y+"]";
	}
}
