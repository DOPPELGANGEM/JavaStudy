package theory.absInterFace03;

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
		
		동물[] ani = new 동물[] {
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
		
//		동물 a = new 동물(); //추상 클래스는 인스턴스를 생성할 수 없음 , 단 타입으로서의 의미는 그대로 갖는다.
// https://computer-science-student.tistory.com/336
		
		
// instanceof 연산자 : 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 True 아니면 False를 반환
// object instanceOf type => Object type이거나 type를 상속받는 클래스라면 true를 리턴 아니면 false

//class Parent{}
//class Child extends Parent{} => child 클래스는 parent를 상속받앗다
// Parent parent = new Parent();
// Child child = new Child();
		
// ex ) parent instanceof parent => true => parent의 경우 parent클래스이므로 true
// ex ) child instanceof Parent => true => child의 경우 parent로부터 상속받은 클래스인 child클래스 이므로 true를 반환
// ex ) parent instanceof Child => false  => parent의 경우 parent클래스인데 child클래스이니 false(자식은 자식이지 부모클래스가아니기때문)
// ex ) child instanceof Child => true => child는 child 클래스이므로 true를 반환
		
	}
}
