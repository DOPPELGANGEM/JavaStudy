package theory.controlStatement;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5)
				continue;
			System.out.println("Coding Everybody" + i);
		}
	//continue : continue 만나면 진행되던 반복문 멈추고(i=5), 그 다음진행 반복문으로 점프 (i++)
	}
}
