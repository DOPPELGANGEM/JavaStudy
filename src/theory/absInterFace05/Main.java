package theory.absInterFace05;

public class Main {

	public static void main(String[] args) {
		개 ob1 = new 개();
		고양이 ob2 = new 고양이();
		고래 ob3 = new 고래();
		상어 ob4 = new 상어();
		펭귄 ob5 = new 펭귄();
		독수리 ob6 = new 독수리();
		
		물생활[] 물 = new 물생활[]  { ob3, ob4, ob5};
		
		for(int i = 0; i < 물.length; i++) {
			물[i].물에서동작();
		}
		
	}
}
