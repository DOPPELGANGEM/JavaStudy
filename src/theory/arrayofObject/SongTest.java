package theory.arrayofObject;

public class SongTest {
	public static void main(String[] args) {
		// 이름과 가수가있는정보를 객체로만들고 객체를 만든 건 객체의 배열로만들어서 출력해달라...
		
		// 객체 생성
		Song s0 = new Song("별헤는밤", "유재하");
		Song s1 = new Song("비상", "임재범");
		Song s2 = new Song("비밀","박완규");
		
		// 객체 배열 생성
		Song[] songs = { s0, s1, s2 }; //https://github.com/DOPPELGANGEM/JavaLecture/blob/master/images/arrayofObject_02.png
		
		//모든 배열 속 객체출력
		for(int i = 0; i < songs.length; i++) {
			//System.out.println(songs[i]); // 배열주소나옴
			System.out.println(songs[i].toStr()); // 반복문을통해객체출력
		}
	}
}
	
	class Song {
		// 필드
		String name;
		String singer;
		
		// 생성자
		public Song(String n, String s) {
			name = n;
			singer = s;
		}
		
		// 메소드
		String toStr() {
			return String.format("Song {name:%s, singer:%s }", name, singer);
		}
	}

