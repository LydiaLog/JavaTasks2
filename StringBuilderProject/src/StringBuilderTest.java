/*
 * String�� �ܼ� ���ڿ� ������ ���� Ŭ����
 * StringBuilder, StringBuffer�� ���ڿ� ������ ȿ������ Ŭ����
 * StringBuilder, StringBuffer�� ���� �������̽�
 */
//import java.lang.StringBuilder; �⺻ import ��
import java.util.Scanner;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = null;
		StringBuilder sb  = null;
		
		System.out.println("���ڿ��� �Է��ϼ���");
		input = s.nextLine();
		
		sb = new StringBuilder(input);
		
		//System.out.println(input + "�� �ԷµǾ����ϴ�");
		System.out.println(input.concat("�� �ԷµǾ����ϴ�")); // ���ڿ� �ٿ��� ��¸�
		System.out.println(sb.append("�� �ԷµǾ����ϴ�")); // ���� ���ڿ� ����
		
		sb.insert(0, "java ");
		System.out.println(sb);
		sb.delete(4, 11);
		System.out.println(sb);
		sb.delete(11, 20);
		sb.append(" class");
		sb.append("�� �ԷµǾ����ϴ�");
		System.out.println(sb);
	}

}
