package practice.algorithm;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		// BubbleSort(버블정렬)
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해서는 속도가 느린편이며 역순으로 정렬할 때 가장 느림
		// {2,5,7,9,20}
		
		int[] arr = {9,7,2,20,5};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++) { //9와나머지 비교 그래서 length-1(5가기준이라면 나머지4개 돌리면됨)
			for(int j=i+1; j<arr.length; j++) { // i가 0일때 j가 자기자신과 비교할려고한다. 그럴필요없다 int j=i+1;
				if(arr[i] > arr[j]) { // 0번값이 1번값보다 크다면 두값을 바꿔야된다.
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

// {9,7,2,20,5}
// if(arr)




//{10, 5,7,25,37,8} 버블정렬
