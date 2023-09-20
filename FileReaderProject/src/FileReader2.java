/*
 * 텍스트 파일에서 바이트 별로 문자 읽기
 * 예외 처리
 */
import java.io.*;

public class FileReader2 {

	public static void main(String[] args){
		
		int c; // 한 문자 지정 변수
		int space = 0; // 공백 개수 카운트 할 변수
		int letter = 0; // 문자 개수 카운트 할 변수
		int line = 0; // 줄 바꿈 개수 카운트 할 변수
		int digit = 0; // 숫자 개수 카운트 할 변수
		
		// 예외 처리를 해야 오류 나지 않음
		FileReader in  = null;
		try{
			in = new FileReader("input.txt");// 텍스트 파일을 한 바이트 별로 읽기 위한 코드
			while((c = in.read()) != -1) { //-1이 아닐 경우 파일의 끝 EOF(End Of File)
			if( Character.isSpaceChar(c) )
				space++;
			if( Character.isLetter(c) )
				letter++;
			if( Character.isDigit(c) )
				digit++;
			if( (char)c == '\n' ) //char 처리를 해야 함
				line++;
			System.out.print((char)c);
		}
		}catch(FileNotFoundException fnfe) {
			System.out.println("열고자하는 파일이 존재하지 않습니다.");
			//예외 발생 위치 찾기 : fnfe.printStackTrace();
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
		
		System.out.println("문자 수 : " + letter);
		System.out.println("숫자 수 : " + digit);
		System.out.println("줄바꿈 수 : " + line);
		System.out.println("공백 수 : " + space);
	}

}
