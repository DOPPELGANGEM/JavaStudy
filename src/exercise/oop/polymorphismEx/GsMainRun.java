package exercise.oop.polymorphismEx;

public class GsMainRun {
	public static void main(String[] args) {
		//GS본사(부모 = gsCompany),  GS건설(자식 = GsConstruction) GS편의점(자식 = GsStore) => 다형성실습
		//부모클래스의 참조변수는 자식객체를 참조할 수 있다.(다형성의 시작)
		GsCompany gsCompany = new GsCompany();
		GsCompany gsConstruction = new GsConstruction(); // 업캐스팅(부모모양만있으면된다.)
		GsCompany gsStore = new GsStore();
		
		// 여러 타입의 객체를 하나의 타입으로 관리할 수 있고 그 하나의 타입으로 여러객체를 관리하더라도 실행형태가 정의된 모양대로 서로달라진다. (이게엄청난강점!)
		gsCompany.gsCompany();
		gsConstruction.gsCompany(); // 재정의된 자식메서드가호출 // 분명히 gsConstruction의 내용이 있는데안보임. 왜? 참조하고있는 데이터타입이 gsCompany타입이라서그런다.
		gsStore.gsCompany();
		
		GsCompany[] gs = new GsCompany[] {gsCompany, gsConstruction, gsStore}; //하나의 타입으로 묶어줄 수 있다.
		for(int i = 0; i < gs.length; i++) {
			gs[i].gsCompany();
			// 하나의 타입으로 여러 객체 관리 (GsCompany라는 타입으로 여러타입의객체관리)
			// gsCompany가 gsCompany()를 호출했을 때 => GS 기업의 본사입니다!
			// gsConstruction가 gsCompany()를 호출했을 때 => GS 기업의 본사를 GS건설에서 재정의합니다.
			// gsStore가 gsCompany()를 호출했을 때 => GS 기업의 본사를 GS편의점에서 재정의합니다. => 이게바로 다형성
			
		}
		
		System.out.println("=================");
		
	// * 객체가변한것이아니라 참조변수의 타입에 따라 참조하는 객체의 볼 수 있는 멤버의 범위가 다르다!
		GsConstruction temp = (GsConstruction)gsConstruction; // 다운캐스팅
		System.out.println(temp); //참조값동일
		System.out.println(gsConstruction); //참조값동일
		temp.construction(); // 다운캐스팅후 자식 멤버 사용 가능
		
		//instanceof : 객체가 어떤 타입으로부터 만들어졌는지 확인해볼 수 있는 연산자
		System.out.println(gsConstruction instanceof GsCompany); // GsCompany가 gsConstruction으로 만들어진 객체냐? 
		System.out.println(gsConstruction instanceof GsStore);
		
		for(int i = 0; i < gs.length; i++) {
			gs[i].gsCompany();
			if(gs[i] instanceof GsConstruction) {
				GsConstruction Gc = (GsConstruction)gs[i]; // gs[i]를 GsConstruction타입으로 다운캐스팅해라
				Gc.construction(); // 그리고 그 Gc를 가지고 자식멤버를 활용해라
			} else if(gs[i] instanceof GsStore) {
				GsStore Gs = (GsStore) gs[i];
				Gs.gsStore(); 
			}
		}
		
		
	}
}
