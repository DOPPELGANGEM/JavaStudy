package theory.staticEx;

/*Static 은 Class 소속 
	Static 가 없으면 Instance 소속
	Class 로 Instance를 복사해서 만들었을떄,
	Instance 안에 들어가있는 Static 값을 변경하면 기존에 있는 method,Variable 의 값도 같이 변경된다.
	Instance 안에 들어가있는 Static 이 없는 Instance method,Variable의 값을 변경할 경우 복제품인 Instance 에만 적용된다.

	Class 소속에선 Instance를 부를수 없지만,
	Instance 소속에선 Class,Instance 모두 부를수 있다.
*/

class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() { // 클래스메소드안에서 classVar에접근
		System.out.println(classVar); 
		//System.out.println(instanceVar); // 클래스메소드안애서는 클래스변수에접근가능하지만 인스턴스변수엔 접근할수없다!
	}
	
	public void instanceMethod() { // 인스턴스 메서드 안에서는 클래스변수와 인스턴스변수 모두접근가능(인스턴스메서드 static 뺌)
		System.out.println(classVar); 
		System.out.println(instanceVar);
	}
}

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // 클래스를 통해서 클래스변수에접근가능
		//System.out.println(Foo.instanceVar); // 인스턴스는 인스턴스를 통해 사용하도록 고안된 변수다.
		Foo.classMethod();
		//Foo.instanceMethod(); //instanceMethod는 인스턴스 소속이기때문에 클래스를 통해 접근하는 것은 금지되어있다. 
		
		Foo f1 = new Foo(); 
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1"; // 클래스변수바꾼다
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1"; // f1 인스턴스변수바꾼다.
		System.out.println(f1.instanceVar); // 자신의 인스턴스변수바꾼다.
		System.out.println(f2.instanceVar); // I instance var => f2는 f1과는 독립적인 변수를 운용하고 있기때문에 값이 안바뀐다.
		
		//https://github.com/DOPPELGANGEM/JavaStudy/blob/main/images/static_app.png
		
	}
}
