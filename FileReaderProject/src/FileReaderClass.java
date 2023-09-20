/*
 * �ؽ�Ʈ ���Ͽ��� ����Ʈ ���� ���� �б�
 * ���� ó��
 */
import java.io.*;

public class FileReaderClass {

	public static void main(String[] args){
		
		int c; // �� ���� ���� ����
		// ���� ó���� �ؾ� ���� ���� ����
		FileReader in  = null;
		try{
		in = new FileReader("input.txt"); 
		// �ؽ�Ʈ ������ �� ����Ʈ ���� �б� ���� �ڵ�
		while((c = in.read()) != -1) { // -1�� �ƴ� ��� ������ �� EOF(End Of File)
			System.out.print((char)c);
		}
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �ϴ� ������ �������� �ʽ��ϴ�.");
			//���� �߻� ��ġ ã�� �ڵ� fnfe.printStackTrace();
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
		
		System.out.println();
	}

}
