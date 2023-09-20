/*
 * ���� ���� ���α׷�
 * Ű����� �Է� �ޱ�
 * Scanner ��� System.in ���
 * ���� �б�� �ٸ��� ������ �������� ���� ���� ����
 * �� �̻� ������ �ۼ��� �� ���� �� ����ó��
 * �ð� ����
 */
import java.io.*;

public class FileWriterTime {

	public static void main(String[] args) {
		int c = -1; // �ʱ�ȭ �ؾ� ��
		// ���� �б�� �����ϰ� ���� ���� ����
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("output.txt");
		} catch(IOException ioe) {
			System.out.println("������ ������ �� �����ϴ�.");
		}
		
		System.out.println("������ ���� �ۼ� �� ctrl + z �� �������� ");
		long start = System.currentTimeMillis(); // ���⼭���� �����ϴ� �ð� ī��Ʈ
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
		long end = System.currentTimeMillis(); // ������� �����ϴ� �ð� ī��Ʈ
		try{
			fw.close();
		}catch(IOException e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
		System.out.println("�� �ҿ� �ð� : " + (end - start)/1000 + " ��"); // �ð� ���� ���ϴ´�� ���� ����
	}

}
