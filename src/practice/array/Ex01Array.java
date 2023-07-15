package practice.array;

public class Ex01Array {
	public static void main(String[] args) {
		int[] a; //배열선언
		a = new int[3]; //int 타입의변수 3개를 저장할수있는 공간을 만들었다. a=주소
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("배열의 길이: " + a.length);
		
		System.out.println();
		
		int[] arr = new int[3];
		arr[0] = 20;
		arr[1] = 21;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]); // 아무값도 저장안햇으면 0으로 기본값저장됨
		
		System.out.println();
		
		int[] arr2 = new int[] {30, 31, 32};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]); 
		
		System.out.println();
		
		int[] arr3 = {40, 41, 42, 43}; //제일많이사용
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
	}
}
