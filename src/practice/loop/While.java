package practice.loop;

public class While {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			i++;
			sum += i;
		}
		System.out.println(sum);
	}
}
