/*
 * ������ ����� Ŭ����
 */
import java.io.*;

public class DataInOutExam {

	public static void main(String[] args) {
		FileInputStream fin = null; // DataInputStream�� ���� ���� �ʿ��� Stream
		FileOutputStream fout = null; //DatOutputStram�� ���� ���� �ʿ��� Stream
		//������ ���� ��ü
		DataOutputStream dout = null;
		DataInputStream din = null;
		
		//FileOutputStream�� DataOutputStream�� ������ �ڷ��� �����ŭ �߶� ����
		try {
			/*
			 * fout = new FileOutputStream("data.dat"); 
			 * dout = new DataOutputStream(fout); 
			 * fout�� dout�� �ʿ�� �ϴ� ��
			 * ��, ������ ������ �ʿ䰡 ���� �� �������� ǥ�� ����
			 * ���� �ΰ� ���� �ʿ� ����
			 */
			dout = new DataOutputStream(new FileOutputStream("data.dat"));
		
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		try {
			dout.writeInt(10);
			dout.writeDouble(3.14);
			dout.writeBoolean(true);
			dout.writeUTF("DataOutputStream��");
		}catch(IOException ioe) {
			System.out.println("������ ���忡 ������ �߻��߽��ϴ�.");
		}
		try {
			dout.close();
		} catch (IOException e) {
			System.out.println("�����͸� ���� ���߽��ϴ�.");
		}
		try {
			din = new DataInputStream(new FileInputStream("data.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		try {
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		System.out.println(din.readUTF());
		}catch(IOException ioe) {
			System.out.println("�����͸� ���� ���߽��ϴ�.");
		}
		try {
			dout.close();
		} catch (IOException e) {
			System.out.println("�����͸� ���� ���߽��ϴ�.");
		}
		
	}

}
