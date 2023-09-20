/*
 * �ؽ�Ʈ ���Ͽ��� ����Ʈ ���� ���� �б�
 * ���� ó��
 */
import java.io.*;

public class FileReader2 {

	public static void main(String[] args){
		
		int c; // �� ���� ���� ����
		int space = 0; // ���� ���� ī��Ʈ �� ����
		int letter = 0; // ���� ���� ī��Ʈ �� ����
		int line = 0; // �� �ٲ� ���� ī��Ʈ �� ����
		int digit = 0; // ���� ���� ī��Ʈ �� ����
		
		// ���� ó���� �ؾ� ���� ���� ����
		FileReader in  = null;
		try{
			in = new FileReader("input.txt");// �ؽ�Ʈ ������ �� ����Ʈ ���� �б� ���� �ڵ�
			while((c = in.read()) != -1) { //-1�� �ƴ� ��� ������ �� EOF(End Of File)
			if( Character.isSpaceChar(c) )
				space++;
			if( Character.isLetter(c) )
				letter++;
			if( Character.isDigit(c) )
				digit++;
			if( (char)c == '\n' ) //char ó���� �ؾ� ��
				line++;
			System.out.print((char)c);
		}
		}catch(FileNotFoundException fnfe) {
			System.out.println("�������ϴ� ������ �������� �ʽ��ϴ�.");
			//���� �߻� ��ġ ã�� : fnfe.printStackTrace();
		}catch(IOException ioe) {
			System.out.println("������ ���������� ������ �� �� �����ϴ�.");
		}
		/*
		 * FileReader�� try �ȿ� �����Ƿ� �� ���� ���࿡ ���� ��
		 * ���� ó�� �ʿ�
		 */
		try {
			in.close();
		}catch(NullPointerException npe) {
			System.out.println("������ ������ �ʾҽ��ϴ�.");
		}catch(IOException ioe) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
		System.out.println();
		
		System.out.println("���� �� : " + letter);
		System.out.println("���� �� : " + digit);
		System.out.println("�ٹٲ� �� : " + line);
		System.out.println("���� �� : " + space);
	}

}
