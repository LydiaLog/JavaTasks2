/*
 * ������ �����ϴ� ���� �޼��带 ������ Ŭ����
 * ���� �޼��� static
 */
import java.io.*;

public class FileCopy {
	public static void copy(String str1, String str2) {
		int c = -1; //�ʱ�ȭ �ʿ�
		// �����ϰ� ���� ���� ����
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(str1);
			fw = new FileWriter(str2);
		}catch(FileNotFoundException fnfe) {
			System.out.println("�����ϰ��� �ϴ� ���� ������ �������� �ʽ��ϴ�.");
		}catch(IOException ioe) {
			System.out.println("������ ���ų� ������ �� �����ϴ�.");
		}
		while(true) {
			try {
				if((c = fr.read()) == -1 )
					break;
				fw.write(c);
			}catch(IOException ioe) {
				System.out.println("������ �аų� ���µ� ������ �߻��߽��ϴ�.");
			} 
		}
		try {
		fr.close();
		fw.close();
		}catch(IOException ioe) {
			System.out.println("������ ���������� ���� ���߽��ϴ�.");
		}
		
	}
}

