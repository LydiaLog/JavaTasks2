package mylib.lang;

public class Test {

	public static void main(String[] args) {
		MyString s = new MyString("hallym");
		
		System.out.println("문자의 길이 : " + s.length());
		System.out.println("1번째 위치 문자 : " + s.charAt(1));
		System.out.println("2~4 부분 문자열 : " + s.subString(2, 4));
		System.out.println("역 문자열 : " + s.reverse());

	}

}
