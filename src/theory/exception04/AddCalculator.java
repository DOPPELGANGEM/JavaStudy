package theory.exception04;

public class AddCalculator {
	public int add(int n1, int n2) {
		int result = n1 + n2;
		if(result < 0) {
			throw new ResultScopeException("result:"+result); //예외 발생
		}
		return result;
	}
}
