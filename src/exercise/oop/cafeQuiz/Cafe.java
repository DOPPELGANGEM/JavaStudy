package exercise.oop.cafeQuiz;

public class Cafe {
	// 필드
	public String customerName;
	public String cafeName;
	public int coffeePrice;
	public String coffeeType;
	
	// 생성자 (Cafe객체 생성시 자동호출)
	Cafe(){
		// Cafe 객체 생성 했어서 디폴트생성자
	}
	
	// 매개변수 생성자
	Cafe(String customerName, String cafeName , int coffeePrice , String coffeeType){
		this.customerName = customerName;
		this.cafeName = cafeName;
		this.coffeePrice = coffeePrice;
		this.coffeeType = coffeeType;
	}
	
	String CafeToName() {
		System.out.println("나를호출한객체 : " + this);
		return customerName + " 는" + cafeName + "에서" + coffeePrice + "짜리" + coffeeType + "사 마셨습니다."; 
  
	}
}
