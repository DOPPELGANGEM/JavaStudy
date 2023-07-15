package theory.absInterFace04;

public class Main {

	public static void main(String[] args) {
		개 ob1 = new 개();
		고양이 ob2 = new 고양이();
		고래 ob3 = new 고래();
		상어 ob4 = new 상어();
		펭귄 ob5 = new 펭귄();
		독수리 ob6 = new 독수리();
		
		포유류[] 포 = new 포유류[] {ob1, ob2, ob3};
		어류 어 = ob4;
		조류[] 조 = new 조류[] { ob5, ob6 };
		
		
		동물[] ani = new 동물[] { ob1, ob2, ob3, ob4, ob5, ob6 };
		동물[] ani2 = new 동물[] { 포[0], 포[1], 포[2], 어, 조[0], 조[1] };
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].먹기();
			ani[i].소리내기();
			ani[i].움직이기();
			if(ani[i] instanceof 개) {
				개 tmp = (개)ani[i];
				tmp.개만가지는기능();
			}
		}
		
//		동물 a = new 동물(); //추상 클래스는 인스턴스를 생성할 수 없음 , 단 타입으로서의 의미는 그대로 갖는다.
		
	}
}
