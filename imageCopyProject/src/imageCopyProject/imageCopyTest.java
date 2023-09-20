/*
 * FileInputStream�� FileOutputStream�� �̿��� �̹��� ������ �ٸ� �̸����� �����ϴ� ���α׷�
 */
package imageCopyProject;

import java.io.*;
public class imageCopyTest {

	public static void main(String[] args) {
		FileInputStream fin = null; //���� ���Ͽ� ���� inputStream
		FileOutputStream fout = null; // ���� ���纻�� ������� outputStream
		byte[] temp = new byte[500]; // 500byte�� ����
		
		try {
		fin = new FileInputStream("source.jpeg");
		fout = new FileOutputStream("copy.jpeg");
		}catch(FileNotFoundException fnfe){
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		while(true) {
			int t = 0;
			try {
				t = fin.read(); //���� �߻�
			}catch(IOException ioe) {
				System.out.println("������ ���� �� �����ϴ�.");
			}
			if(t == -1) {
				System.out.println("���� ���縦 ���ƽ��ϴ�.");
				break;
			}
			try{
			fout.write(t); // ���� �߻�
			}catch(IOException ioe) {
				System.out.println("������ ������ �� �����ϴ�.");
			}
		}
		try {
			fin.close();
			fout.close(); //���� ���� ó��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("������ �ݴµ� ������ �߻��߽��ϴ�.");
		}
		
	}

}
