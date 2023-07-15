package homework.version2;

public class Drink { //음료객체클래스 Drink
	
	// 멤버변수
	int drinkNum;
	String name;
	int price;
	
	// 디폴트생성자
	public Drink() {}
	
	// 매개변수가있는 생성자(Drink로 이름같고 매개변수개수와 타입이다르니 오버로딩?)
	public Drink(int drinkNum, String name, int price) {
		setDrinkNum(drinkNum);
		setName(name);
		setPrice(price);
	}
	
	public String toString() {
		return drinkNum + ", " + name + ": " + price + "원";
	}
	
	public int getDrinkNum() {
		return drinkNum;
	}
	
	public void setDrinkNum(int drinkNum) {
		this.drinkNum = drinkNum;
	}
	
//getter 메소드 // 필드가 가지고 있는 값을 가지고 올 수 있게 해준다.(return값을 줘야함)
	public String getName() {
		return name;
	}
	
//setter 메소드 // 전달값을 받아서 메소드 안에서 쓸 수 있게 해주는게 매개변수이다.	
	public void setName(String name) { // 매개변수는 전달값을 받아 메서드에서 사용하게해줌 void라 return 이라 쓰지 않는다!
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
