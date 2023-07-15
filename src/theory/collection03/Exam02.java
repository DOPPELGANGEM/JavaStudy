package theory.collection03;

import java.util.ArrayList;

public class Exam02 {
 public static void main(String[] args) {
	 ArrayList<Info> a1 = new ArrayList<>(); // ArrayList 배열취급
	 
	 a1.add(new Info("홍길동1", 20));
	 a1.add(new Info("홍길동2", 21));
	 a1.add(new Info("홍길동3", 22));
	 
	 for(int i = 0; i < a1.size(); i++) {
		 System.out.println(a1.get(i));
	 }
 }
}



