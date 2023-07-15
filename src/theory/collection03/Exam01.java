package theory.collection03;

import java.util.ArrayList;

public class Exam01 {
 public static void main(String[] args) {
	 ArrayList<Integer> a1 = new ArrayList<>(); // ArrayList 배열취급
	 a1.add(111);
	 a1.add(12);
	 a1.add(21);
	 a1.add(31);
	 a1.add(143);
	 a1.add(11);
	 
	 a1.add(1, 200);
	 a1.remove(3);
	 
	 for(int i = 0; i < a1.size(); i++) {
		 System.out.println(a1.get(i));
	 }
 }
}



