package exercise.algorithim;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		//{10, 5,7,25,37,8} 버블정렬
		//배열 내용 출력하기 (Arrays.toString())
		//자바에서 배열 내용을 출력해보려고 배열 자체에서 toString()을 사용하면 배열의 내용이 아니라 배열의 주소값이 출력됩니다. 
		//배열의 내용을 출력하려면 Arrays.toString()을 사용해야 합니다. 예제 코드는 아래와 같습니다.
		
		int arrs[] = {10, 5, 7, 25, 37, 8}; // index 0부터 5까지 6개의길이가있는배열
		System.out.println(Arrays.toString(arrs));
		System.out.println("======= 버블정렬후 =======");
		
		for(int i=0; i< arrs.length-1; i++) { //해당인덱스와 나머지를 비교하니 length -1 ?
			for(int j=i+1; j < arrs.length; j++) { // i가 0일때 자기자신과 비교할려함. 그럴 필요없다 int j = i+1
				if(arrs[i] > arrs[j]) { //0번값이 1번부터 크다면 두값을바꿔야함
					int temp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrs)); //	{5, 7, 8, 10, 25, 37} => 정답
		
		
	}
}

// ---- part1 start 
// {10, 5, 7, 25, 37, 8}
//	if(arrs[0] > arrs[1]) {
//		temp = arrs[0];
//		arrs[0] = arrs[1];
//		arrs[1] = temp;
//	}
//	{5, 10, 7, 25, 37, 8}
//	if(arrs[1] > arrs[2]) {
//		temp = arrs[1];
//		arrs[1] = arrs[2];
//		arrs[2] = temp;
//	}
//	{5, 7, 10, 25, 37, 8}
//	if(arrs[2] > arrs[3]) {
//		temp = arrs[2];
//		arrs[2] = arrs[3];
//		arrs[3] = temp;
//	}
//	{5, 7, 10, 25, 37, 8}
//	if(arrs[3] > arrs[4]) {
//		temp = arrs[3];
//		arrs[3] = arrs[4];
//		arrs[4] = temp;
//	}
//	{5, 7, 10, 25, 37, 8}
//	if(arrs[4] > arrs[5]) {
//		temp = arrs[3];
//		arrs[4] = arrs[5];
//		arrs[5] = temp;
//	}
//	{5, 7, 10, 25, 8, 37}
//	//---- part1 end
//	
//	
//	//---- part2 start 
//	{5, 7, 10, 25, 8, 37}
//	if(arrs[3] > arrs[4]) {
//		temp = arrs[3];
//		arrs[3] = arrs[4];
//		arrs[4] = temp;
//	}
//	{5, 7, 10, 8, 25, 37}
//	//---- part2 end
//	
//	//---- part3 start 
//	{5, 7, 10, 8, 25, 37}
//	if(arrs[2] > arrs[3]) {
//		temp = arrs[2];
//		arrs[2] = arrs[3];
//		arrs[3] = temp;
//	}
//	{5, 7, 8, 10, 25, 37}













