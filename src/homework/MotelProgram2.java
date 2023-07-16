package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotelProgram2 {
	public static void main(String[] args) throws IOException {
		
		//	Scanner와 달리 BufferedReader는 개행문자만 경계로 인식하고 입력받은 데이터가 String으로 고정된다.
		//	그렇기때문에 따로 데이터를 가공해야하는 경우가 많다. 하지만 Scanner보다 속도가 빠르다
		//	java.util.Scanner => 수행시간 6.068초
		//	java.io.BufferedReader => 수행시간 0.934초
		
		//	BufferedReader 사용법
		//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		//	String s = br.readLine();
		//	int i = Integer.parseInt(br.readLine());
		
		// 입력은 readLine(); 이라는 메소드를 사용한다. String으로 리턴값이 고정되어 있기 때문에 다른타입으로 입력을 받고자 한다면
		// 반드시 형변환이 필요하다. 그리고 예외처리를필요로함.
		// readLine()시 마다 try/catch로 감싸주어도되고 throws IOException을 통한 예외처리를한다.(대부분 후자)
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print("방의 갯수를 입력하세요 : ");
		
		int roomsNum = Integer.parseInt(in.readLine());
		int[] roomsArr = new int[roomsNum]; // 방의갯수를 배열로 담음
		int menu = 1, quit = 1;
		while(quit == 1) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			menu = Integer.parseInt(in.readLine());
			int enterRoomNum; // 입실할방
			
			switch(menu) {
			
				case 1 :
					System.out.print("몇번방에 입실하시겠습니까? : ");
					enterRoomNum = Integer.parseInt(in.readLine());
					
					if(enterRoomNum > roomsNum || enterRoomNum < 1) { // 입실할방이 방의갯수보다는 크면 안됨 || 방이 1보다는 작을 수는 없음
						System.out.println("선택가능한 호실을 벗어났습니다.");
						break;
					}
					
					if(roomsArr[enterRoomNum-1] == 1) {
						System.out.println("사용중인 방입니다. 다른방을 이용해주세요");
						break;
					}
						
					System.out.println(enterRoomNum + "호실에 입실하시면 됩니다.");
					roomsArr[enterRoomNum-1] = 1;
					break;
				
				case 2 :
//					try { 
//						System.out.print("몇번방에서 퇴실하시겠습니까 ? : ");
//						enterRoomNum = Integer.parseInt(in.readLine());
//					} catch(menu == 1) {
//						System.out.println("아직 입실 전입니다.");
//					} finally {
//						roomsArr[enterRoomNum-1] = -1;
//						System.out.println(enterRoomNum + "호실이 퇴실처리되었습니다.");
//					}
			
					System.out.print("몇번방에서 퇴실하시겠습니까 ? : ");
					enterRoomNum = Integer.parseInt(in.readLine());
					
					roomsArr[enterRoomNum-1] = -1;
					System.out.println(enterRoomNum + "호실이 퇴실처리되었습니다.");
					
				case 3 :
					System.out.println("방 상태를 보시겠습니까? : ");
					for(int i=0; i<roomsArr.length; i++) {
						if(roomsArr[i] == 1) {
							System.out.println((i+1) + "호실은 사용중입니다.");
						} else {
							System.out.println((i+1) + "호실은 비었습니다.");
						}
					}
				break;
			
				case 4 :
					quit = -1;
					System.out.println("프로그램을 종료합니다.");
					break;
					
				default :
					System.out.println("잘못입력하셨습니다.");
			}
		}

	}
}




















