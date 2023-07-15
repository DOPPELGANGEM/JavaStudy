package practice.array;

public class Tv {
	public static void main(String[] args) {
		// 객체배열 == 참조변수배열
		// TV tv1, tv2, tv3
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
		
		//객체를 생성해서 배열의 각 요소에 저장
		//참조변수를 만든다음 객체를만들어서 따로넣어주어야한다.
		//https://kadosholy.tistory.com/90 (그림참고)
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		System.out.println(tvArr[0]);
		System.out.println(tvArr[1]);
		System.out.println(tvArr[2] );

	}
}
