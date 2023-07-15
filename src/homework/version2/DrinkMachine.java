package homework.version2;

public class DrinkMachine { //자판기객체 클래스 DrinkMachine
	public static final int COKE = 1; // switch case에서 사용하기위한 정적변수 static! 음료번호
	public static final int CIDER = 2;
	public static final int FANTA = 3;
	public static final int MILKIS = 4;
	public static final int POCARI = 5;
	private Drink coke = new Drink(COKE,"콜라",1500);
	private Drink cider = new Drink(CIDER, "사이다", 1000);
	private Drink fanta = new Drink(FANTA, "환타", 2000);
	private Drink milkis = new Drink(MILKIS, "밀키스", 2500);
	private Drink pocari = new Drink(POCARI, "환타", 3000);
	int inputMoney;
	
	//메뉴
	public void menu() {
		System.out.println("==================");
		System.out.println("       Menu       ");
		System.out.println("==================");
		System.out.println(coke + "\n" + cider + "\n" + fanta + "\n" + milkis + "\n" + pocari);
		System.out.println("==================");
	}
	
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	public Drink getCoke() {
		return coke;
	}
	
	public void setCoke(Drink coke) {
		this.coke = coke;
	}
	
	public Drink getCider() {
		return cider;
	}
	
	public void setCider(Drink cider) {
		this.cider = cider;
	}
	
	public Drink getFanta() {
		return fanta;
	}
	
	public void setFanta(Drink fanta) {
		this.fanta = fanta;
	}
	
	// 넣은 돈
	public void inputMoney(int inputMoney) {
		boolean result = true;
		if(inputMoney >= 1000) { // 위에제일싼메뉴 사이다가 1000원이기때문에 그 이상은 넣어줘야함
			this.inputMoney += inputMoney;
			System.out.println("넣은 돈: " + inputMoney + "원");
		} else {
			System.out.println("1000원 이상 돈을 넣어주세요.");
		}
	}
	
	// 음료선택
	public Drink drinkSelect(int drinkNum) {
		switch(drinkNum) {
			case COKE :
				return drinkReturn(coke);
			case CIDER :
				return drinkReturn(cider);
			case FANTA : 
				return drinkReturn(fanta);
			case MILKIS : 
				return drinkReturn(milkis);
			case POCARI : 
				return drinkReturn(pocari);
			default :
				return null;
		}
	}
	
	// 잔돈반환
	public int changeMoney(Drink drink) {
		int change = inputMoney - drink.getPrice();
		System.out.println("잔액 : " + change + "원");
		return change;
	}
	
	// 음료나오는 조건
	public Drink drinkReturn(Drink drink) {
		if(inputMoney < drink.getPrice()) {
			return null;
		}
		return drink;
	}
		
}