package mylib.lang;

public class Test {

	public static void main(String[] args) {
		MyString s = new MyString("hallym");
		
		System.out.println("������ ���� : " + s.length());
		System.out.println("1��° ��ġ ���� : " + s.charAt(1));
		System.out.println("2~4 �κ� ���ڿ� : " + s.subString(2, 4));
		System.out.println("�� ���ڿ� : " + s.reverse());

	}

}
