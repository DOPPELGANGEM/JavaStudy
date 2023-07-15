package exercise.oop.polymorphismEx;

public class GsConstruction extends GsCompany { 
	@Override
	void gsCompany() {
		System.out.println("GS 기업의 본사를 GS건설에서 재정의합니다.");
	}
	void construction() {
		System.out.println("GS 건설사입니다.");
	}
}
