package theory.exception03;

import java.io.IOException;

class MyInput{
	int input() throws IOException {
		int result = 0;
		result = System.in.read(); //키보드로 1바이트를 읽어들이는 메서드
		return result;
	}
}

public class Exam02 {
	public static void main(String[] args) {
		MyInput mi = new MyInput();
		try {
			mi.input();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
