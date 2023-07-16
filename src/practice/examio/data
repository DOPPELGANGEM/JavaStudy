package theory.examio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		File file = new File("src\\theory\\examio\\data");
		FileOutputStream fos = null; // Stream => 흐름 
		
		try {
			fos = new FileOutputStream(file);
			fos.write(66);
			fos.write(66);
			fos.write(66);
			fos.write(66);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close(); // 파일을 잘 썻다면 닫아줘야함
					} catch(IOException e) {}
			}
		}
	}
}
