/*
 * 파일 쓰기 프로그램
 * 키보드로 입력 받기
 * Scanner 대신 System.in 사용
 * 파일 읽기랑 다르게 파일이 존재하지 않을 수는 없음
 * 더 이상 파일을 작성할 수 없을 시 예외처리
 * 시간 측정
 */
import java.io.*;

public class FileWriterTime {

	public static void main(String[] args) {
		int c = -1; // 초기화 해야 함
		// 파일 읽기와 동일하게 변수 먼저 선언
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("output.txt");
		} catch(IOException ioe) {
			System.out.println("파일을 생성할 수 없습니다.");
		}
		
		System.out.println("저장할 내용 작성 후 ctrl + z 를 누르세요 ");
		long start = System.currentTimeMillis(); // 여기서부터 동작하는 시간 카운트
		while(true) {
			try {
				if (( c = System.in.read()) == -1)
					break;
			}catch(IOException ioe){
				System.out.println("키보드 입력에 문제가 발생했습니다.");
			}
	
			try {
				fw.write(c);
			}catch(IOException ioe) {
				System.out.println("파일을 저장할 수 없습니다.");
			}
		}
		long end = System.currentTimeMillis(); // 여기까지 동작하는 시간 카운트
		try{
			fw.close();
		}catch(IOException e) {
			System.out.println("파일을 닫지 못했습니다.");
		}
		System.out.println("총 소요 시간 : " + (end - start)/1000 + " 초"); // 시간 설정 원하는대로 변경 가능
	}

}
