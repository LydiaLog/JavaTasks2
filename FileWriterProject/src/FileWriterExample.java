/*
 * ���� ���� ���α׷�
 * Ű����� �Է� �ޱ�
 * Scanner ��� System.in ���
 * ���� �б�� �ٸ��� ������ �������� ���� ���� ����
 * �� �̻� ������ �ۼ��� �� ���� �� ����ó��
 */
import java.io.*;

public class FileWriterExample {
	
	public static void main(String[] args) {
		int c = -1; // �ʱ�ȭ �ؾ� ��
		// ���� �б�� �����ϰ� ���� ���� ����
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("output.txt");
		} catch(IOException ioe) {
			System.out.println("������ ������ �� �����ϴ�.");
		}
		
		System.out.println("������ ���� �ۼ� �� ctrl + z �� �������� "); // �ݵ�� ���� �� ctrl + z(���� �Ϸ�) �ϱ� 
		while(true) {
			try {
				if (( c = System.in.read()) == -1)
					break;
			}catch(IOException ioe){
				System.out.println("Ű���� �Է¿� ������ �߻��߽��ϴ�.");
			}
	
			try {
				fw.write(c);
			}catch(IOException ioe) {
				System.out.println("������ ������ �� �����ϴ�.");
			}
		}
		try{
			fw.close();
		}catch(IOException e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
	}

}
