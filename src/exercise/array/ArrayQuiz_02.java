package exercise.array;

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arrs = {1,2,3,4,5,6,7,8,9,10};
		for(int i = arrs.length-1; i >= 0; i--) {
			System.out.print(arrs[i] + " ");
		}
		
	}
}
