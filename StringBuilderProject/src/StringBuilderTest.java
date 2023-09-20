/*
 * String은 단순 문자열 참조를 위한 클래스
 * StringBuilder, StringBuffer는 문자열 편집이 효율적인 클래스
 * StringBuilder, StringBuffer는 같은 인터페이스
 */
//import java.lang.StringBuilder; 기본 import 됨
import java.util.Scanner;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = null;
		StringBuilder sb  = null;
		
		System.out.println("문자열을 입력하세요");
		input = s.nextLine();
		
		sb = new StringBuilder(input);
		
		//System.out.println(input + "이 입력되었습니다");
		System.out.println(input.concat("이 입력되었습니다")); // 문자열 붙여서 출력만
		System.out.println(sb.append("이 입력되었습니다")); // 기존 문자열 변경
		
		sb.insert(0, "java ");
		System.out.println(sb);
		sb.delete(4, 11);
		System.out.println(sb);
		sb.delete(11, 20);
		sb.append(" class");
		sb.append("이 입력되었습니다");
		System.out.println(sb);
	}

}
