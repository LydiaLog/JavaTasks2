import mylib.lang.*;

public class MyStringTest {

	public static void main(String[] args) {
		MyString s = new MyString("hallym university");
		System.out.println("������ ���ڿ� ���� : " + s.length());
		System.out.println("5��° ���� : " + s.charAt(4));
		System.out.println("0~6 �κ� ���ڿ� : " + s.subString(0, 6));
		System.out.println("�� ���ڿ� : " + s.reverse());

	}

}
