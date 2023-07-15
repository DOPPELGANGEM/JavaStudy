package theory.recursiveMethod;

public class Recursion {
	// 재귀함수 : 함수가 직접 또는 간접적으로 자신을 호출하는 프로세스를 재귀함수라한다.
	public static void recursionMethod(int n) {
		System.out.println("recursionMethod Call!!n:" +n);
		if(n == 0) {
			return;
		}
		recursionMethod(n-1);
		System.out.println("recursionMethod returned.n :" + n);
	}
	
	public static void main(String []args) {
		recursionMethod(4); //처음에 4를전달햇으니 4이다.
	}
}
