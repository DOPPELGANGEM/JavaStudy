package practice.loop;

public class ForEx {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합" + sum);
		
		System.out.println("=============================================");
		
		for(int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
