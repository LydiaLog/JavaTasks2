/*
 * best.txt ���Ͽ��� ���ڸ� �迭�� �о� StringTokenizer�� �ܾ�� �и� ����ϴ� ���α׷�
 * ���� ����� Ŭ���� �����ؾ� �� (import java.io.*;)
 * StringTokkenizer ��� �� import �ʼ�
 * ����Ʈ ������ ����
 */
import java.io.*;
import java.util.StringTokenizer;

public class FileinputStreamExam {

	public static void main(String[] args) {
		// �׻� ���� ���� �� ���� ��ü �����ϱ�
		FileInputStream f = null;
		byte[] bArr = new byte[1000]; // 500¥�� byte �迭 ����(�ؽ�Ʈ ���� ����)
		StringTokenizer s = null;
		
		try {
		f = new FileInputStream("best.txt"); // ���� �߻�
		}catch(FileNotFoundException fnfe) { // fnfe�� ���� �߻� �� �����Ǵ� ���� ��ü ����
			fnfe.printStackTrace(); // ���� ������ ���α׷������� ����(��� ���ܰ� �߻��ߴ��� �˱� ���� ���̱� ����)
		}
		try {
		f.read(bArr);
		}catch(IOException ioe) {
			System.out.println("������ �дµ� ������ �߻��߽��ϴ�.");
		}
		
		s = new StringTokenizer(new String(bArr), " ,."); // ""���� ���ڵ� �������� �ڸ���
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
