package theory.controlStatement;

public class ArrayApp {

	public static void main(String[] args) {
		// egoing, jinhuck, youbin
		
		//String users = "egoing, jinhuck, youbin";
		String[] users = new String[3]; //문자열로 이루어진 배열이라고하는데이터타입을 값으로하는 users라고 하는 변수를 만드는 거구나
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		System.out.println(users[1]);
		System.out.println(users.length); //배열의 값에 몇개가담겨잇는가? 3개 => 3칸짜리배열
		
		//int[] scores = new int[3];
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
