package theory.collection02;

public class Info {
	private String name;
	private int age;
	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age +"]" ;
	}
}
