/*
 * 텍스트 파일에서 바이트 별로 문자 읽기
 * 예외 처리
 */
import java.io.*;

public class FileReaderClass {

	public static void main(String[] args){
		
		int c; // 한 문자 지정 변수
		// 예외 처리를 해야 오류 나지 않음
		FileReader in  = null;
		try{
		in = new FileReader("input.txt"); 
		// 텍스트 파일을 한 바이트 별로 읽기 위한 코드
		while((c = in.read()) != -1) { // -1이 아닐 경우 파일의 끝 EOF(End Of File)
			System.out.print((char)c);
		}
		}catch(FileNotFoundException fnfe) {
			System.out.println("열고자 하는 파일이 존재하지 않습니다.");
			//예외 발생 위치 찾는 코드 fnfe.printStackTrace();
		}catch(IOException ioe) {
			System.out.println("파일은 존재하지만 파일을 열 수 없습니다.");
		}
		/*
		 * FileReader가 try 안에 있으므로 이 문장 실행에 오류 남
		 * 예외 처리 필요
		 */
		try {
			in.close();
		}catch(NullPointerException npe) {
			System.out.println("파일이 열리지 않았습니다.");
		}catch(IOException ioe) {
			System.out.println("파일을 닫지 못했습니다.");
		}
		System.out.println();
		
		System.out.println();
	}

}
