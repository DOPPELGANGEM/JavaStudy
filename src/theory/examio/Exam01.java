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
			fos = new FileOutputStream(file); //뒤에 true,false도가능
			fos.write(66);
			fos.write(66);
			fos.write(66);
			fos.write(66);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close(); // 파일을 잘 썻다면 닫아줘야함 (해당파일을사용중입니다..연상)
					} catch(IOException e) {}
			}
		}
	}
}


//... Stream(InputStream, OutputStream) => 데이터를읽어들이거나 내보낼때 1byte단위로(데이터복사,데이터전송)
// 채팅같이 명확하게 바로해석할려면 ...Reader, ...Writer
//...Reader,, ...Writer  2byte단위로 입출력 char(디폴트)