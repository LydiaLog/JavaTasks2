/*
 * best.txt 파일에서 문자를 배열에 읽어 StringTokenizer로 단어로 분리 출력하는 프로그램
 * 파일 입출력 클래스 포함해야 함 (import java.io.*;)
 * StringTokkenizer 사용 시 import 필수
 * 바이트 단위로 끊음
 */
import java.io.*;
import java.util.StringTokenizer;

public class FileinputStreamExam {

	public static void main(String[] args) {
		// 항상 변수 선언 후 파일 객체 생성하기
		FileInputStream f = null;
		byte[] bArr = new byte[1000]; // 500짜리 byte 배열 생성(텍스트 내용 저장)
		StringTokenizer s = null;
		
		try {
		f = new FileInputStream("best.txt"); // 예외 발생
		}catch(FileNotFoundException fnfe) { // fnfe는 예외 발생 시 생성되는 예외 객체 변수
			fnfe.printStackTrace(); // 최종 버전의 프로그램에서는 제외(어디서 예외가 발생했는지 알기 위해 쓰이기 때문)
		}
		try {
		f.read(bArr);
		}catch(IOException ioe) {
			System.out.println("파일을 읽는데 문제가 발생했습니다.");
		}
		
		s = new StringTokenizer(new String(bArr), " ,."); // ""안의 문자들 기준으로 자르기
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
