package theory.absInterFace02;

public class Main {

	public static void main(String[] args) {
		개 dog = new 개();
		dog.움직이기();
		dog.소리내기();
		dog.먹기();
		dog.개만가지는기능();
		
		고양이 cat = new 고양이();
		cat.움직이기();
		cat.소리내기();
		cat.먹기();
		cat.고양이만가지는기능();
		
		System.out.println("-------------------");
		
		동물[] ani = new 동물[] { //동물 타입으로 개와 고양이를 관리할수 있다.
			dog, cat
		};
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].먹기();
			ani[i].소리내기();
			ani[i].움직이기();
			if(ani[i] instanceof 개) {
				개 tmp = (개)ani[i];
				tmp.개만가지는기능();
			}
		}
		
		
		
	}
}


//상속 : 자식(클래스)이 상속받고 싶은 부모(클래스)를 선택해서 물려받는다. 이때 상속받는 클래스를 자식클래스, 하위클래스 또는 서브클래스라고 부른다. 상속을 해주는 클래스를 부모클래스, 상위클래스 또는 슈퍼클래스라고 한다.

//https://blog.naver.com/PostView.nhn?blogId=heartflow89&logNo=220960019390