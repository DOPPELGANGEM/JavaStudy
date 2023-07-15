package theory.object2;

public class ExamString {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = new String("hell");
		
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
		

	}

}
