/*
 * Ű����� �Է¹��� ������ ���ϸ�
 * ���� ������� ���ϸ� �Է�
 */
import java.io.File;
import java.util.Scanner; //�Է� �޾ƾ� ��

public class FileCopyClass {

	public static void main(String[] args) {
		String source = null; //������ ���ϸ�
		String target = null; //������ ��� ���ϸ�
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ ���ϸ��� �Է��ϼ���.");
		source = s.next(); // ���� ����
		System.out.println("������ ��� ���ϸ��� �Է��ϼ���.");
		target = s.next(); // ���� ����
		
		FileCopy.copy(source, target);
		
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		
	}

}
