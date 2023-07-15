package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotelProgram {
	public static void main(String[] args) throws IOException {
		
		//https://m.blog.naver.com/ka28/221850826909
		//https://cwithvisual.tistory.com/entry/switch-%EA%B5%AC%EB%AC%B8
		
		//BufferedReader:Scanner와 유사
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		System.out.print("방의 갯수를 입력하세요:");
		
		//readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받을려면 형변화을 꼭해준다.
		// 두번째는 예외처리를 해준다. readLine을 할때마다 try & catch를 활용해 예외처리를 해주어도되지만  대개 throws IOException을 통하여 작업한다 
		int roomsNum = Integer.parseInt(in.readLine()); //Int
		int [] rooms = new int[roomsNum];
		int menu = 1, quit = 1;
		while(quit == 1) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			menu = Integer.parseInt(in.readLine());
			int roomNum;
			int i;
			
			switch(menu) {
				case 1:
				System.out.print("몇번방에 입실하시겠습니까? : ");
				roomNum = Integer.parseInt(in.readLine());
				
				if(roomNum > roomsNum || roomNum < 1) {
					System.out.println("선택가능 호실을 벗어났습니다!");
					break;
				}
				
				if(rooms[roomNum-1] == 1) {
					System.out.println("사용중인 방입니다.");
					break;
				}
				
				System.out.println(roomNum + "호실에 입실하시면 됩니다!");
				rooms[roomNum-1] = 1;
				break;
				
				case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까? : ");
				roomNum = Integer.parseInt(in.readLine());
				
				
				rooms[roomNum-1] = -1;
				System.out.println(roomNum + "호실이 퇴실처리되었습니다!");
				
				case 3:
				System.out.println("방상태를 보시겠습니까? : ");
				for(i=0; i<rooms.length; i++) {
					if(rooms[i] == 1) {
						System.out.println(i+1+"호실이 사용중입니다.");
					} else {
						System.out.println(i+1+"호실은 비었습니다.");
					}
				}
				break;
				
				case 4:
					quit = -1;
					System.out.println("프로그램을 종료합니다.");
					break;
					
				default:
					System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}




















