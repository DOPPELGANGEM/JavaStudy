package practice.array;

public class Array_Basic {
	public static void main(String[] args) {
		
		//배열 활용 => https://pathas.tistory.com/126
		//10개의 int형 데이터를 갖는 배열 arrayTest를 선언
		int[] arrayTest = new int[10];
		
		//for문을 이용해서 arrayTes에 10~100의 값을 저장
		for(int i = 0; i < 10; i++) {
			arrayTest[i] = (i+1) * 10;
		}
//		System.out.println(arrayTest.length); //10
		
		//for문으로 배열의 각각의 값을 출력
		for(int i = 0; i < arrayTest.length; i++) {
			System.out.print(arrayTest[i] + " ");  
		}
		
		
		
		
	}
}
