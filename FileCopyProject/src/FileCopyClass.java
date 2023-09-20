/*
 * 키보드로 입력받은 복사할 파일명
 * 새로 만들어진 파일명 입력
 */
import java.io.File;
import java.util.Scanner; //입력 받아야 함

public class FileCopyClass {

	public static void main(String[] args) {
		String source = null; //복사할 파일명
		String target = null; //복사할 대상 파일명
		Scanner s = new Scanner(System.in);
		
		System.out.println("복사할 파일명을 입력하세요.");
		source = s.next(); // 띄어쓰기 없음
		System.out.println("복사할 대상 파일명을 입력하세요.");
		target = s.next(); // 띄어쓰기 없음
		
		FileCopy.copy(source, target);
		
		System.out.println("복사가 완료되었습니다.");
		
	}

}
