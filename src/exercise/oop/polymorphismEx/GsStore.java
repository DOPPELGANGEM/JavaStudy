package exercise.oop.polymorphismEx;

public class GsStore extends GsCompany { 
	@Override
	void gsCompany() {
		System.out.println("GS 기업의 본사를 GS편의점에서 재정의합니다.");
	}
	void gsStore() {
		System.out.println("GS 편의점입니다.");
	}
}
