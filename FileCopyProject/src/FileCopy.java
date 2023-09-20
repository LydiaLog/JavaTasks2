/*
 * 파일을 복사하는 정적 메서드를 가지는 클래스
 * 정적 메서드 static
 */
import java.io.*;

public class FileCopy {
	public static void copy(String str1, String str2) {
		int c = -1; //초기화 필요
		// 동일하게 변수 먼저 선언
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(str1);
			fw = new FileWriter(str2);
		}catch(FileNotFoundException fnfe) {
			System.out.println("복사하고자 하는 원본 파일이 존재하지 않습니다.");
		}catch(IOException ioe) {
			System.out.println("파일을 열거나 생성할 수 없습니다.");
		}
		while(true) {
			try {
				if((c = fr.read()) == -1 )
					break;
				fw.write(c);
			}catch(IOException ioe) {
				System.out.println("파일을 읽거나 쓰는데 오류가 발생했습니다.");
			} 
		}
		try {
		fr.close();
		fw.close();
		}catch(IOException ioe) {
			System.out.println("파일을 정상적으로 닫지 못했습니다.");
		}
		
	}
}

