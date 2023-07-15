package theory.polymorphsim.friends;

public class Main {

	public static void main(String[] args) {
		이동환 LeeDongHwan = new 이동환();
		LeeDongHwan.개인차();
		LeeDongHwan.여자친구();
		LeeDongHwan.제닉스알바();

		김관희 KimKwanHee = new 김관희();
		KimKwanHee.개인차();
		KimKwanHee.여자친구();
		KimKwanHee.제닉스알바();
		
		System.out.println("===============================================");
		
		환장듀오[] noDabDuo = new 환장듀오[] {
				LeeDongHwan, KimKwanHee //업캐스팅
		};
		
		for(int i = 0; i < noDabDuo.length; i++) {
			//두개의 다른객체를 하나의 타입으로관리
			//업캐스팅이란건 김관희란게 안보일뿐이지 없는게 아니란것 (다운캐스팅할때는 형태를 명확히해야함)
			
			noDabDuo[i].개인차();
			noDabDuo[i].여자친구();
			noDabDuo[i].제닉스알바();
			if(noDabDuo[i] instanceof 이동환) {
				이동환 tmp = (이동환)noDabDuo[i];
				tmp.이동환만가지는기능();
			}	
		}
		
	}
}
