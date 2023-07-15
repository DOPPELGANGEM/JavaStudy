package theory.method;

class Member {

  private String name;
  private int age;

  public Member(String name, int age) {
      this.name = name;
      this.age = age;
  } 
  
  @Override
  public String toString() {
  	return "Name: " + name + "Age : " + age;
  }

}

public class ToStringEx {
	public static void main(String[] args) {
		
		Member member = new Member("Brad", 16);
		System.out.println(member);
		
		
	}
}
