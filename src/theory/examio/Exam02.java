package theory.examio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] args) {
		File file = new File("src\\\\theory\\\\examio\\\\data");
		
		System.out.println(file.length());
		System.out.println(file.canExecute()); // 파일이실행이가능한지
		System.out.println(file.canRead()); // 파일의 읽을수있는지
		System.out.println(file.getAbsolutePath()); // 파일의절대경로
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int data = 0;
			while((data = fis.read()) != -1) { //-1 : EOF(End Of File) => 더이상읽을수있는 데이터가없음
				System.out.print((char)data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close(); // 빨대를닫아준다!
				} catch(IOException e) {}
			}
		}
	}
}
