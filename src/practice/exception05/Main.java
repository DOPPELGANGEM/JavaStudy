package practice.exception05;

/*
 * Exception
 * 1.예외처리 구문이 반드시 필요한예외 (try ~ catch 또는 throws)
 * 2.컴파일 시 예외 처리 구문 작성 여부를 확인
 * 
 * RuntimeException
 * 1.예외처리 구문이 반드시 필요하지는 않음
 * 2.실행 중 예외가 발생하면 예외처리 구문을 찾아서 실행
 * */

public class Main {
	public static void main(String[] args) {
		AddCalculator addCalc = new AddCalculator();
		
		int ret = 0;
		try {
			ret = addCalc.add(1,-10);
		} catch (ResultScopeException e) {
			e.printStackTrace();
		}
		System.out.println(ret);
		
		
	}
}
