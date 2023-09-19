import mylib.lang.*;

public class MyStringTest {

	public static void main(String[] args) {
		MyString s = new MyString("hallym university");
		System.out.println("생성된 문자열 길이 : " + s.length());
		System.out.println("5번째 문자 : " + s.charAt(4));
		System.out.println("0~6 부분 문자열 : " + s.subString(0, 6));
		System.out.println("역 문자열 : " + s.reverse());

	}

}
