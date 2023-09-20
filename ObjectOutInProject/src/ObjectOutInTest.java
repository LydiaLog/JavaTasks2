/*
 * Ŭ������ ��ü ������ ���� => output
 * �о���� �κ� => Input
 */
import java.io.*;

public class ObjectOutInTest {

	public static void main(String[] args) {
		Student s = new Student("kim", 21, 1, 4.2f);
		/*��ü�� �����Ϸ��� ������ ��ü�� implements Serializable�̾�� ��
		 * StudentŬ������ ������
		 */
		
		ObjectOutputStream o = null;
		ObjectInputStream i = null;
		
		try {
			o = new ObjectOutputStream(new FileOutputStream("objectdata.dat"));
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		try {
			o.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �� �� �����ϴ�.");
		}
		
		try {
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ���� �� �����ϴ�.");
		}
		
		try {
			i = new ObjectInputStream(new FileInputStream("objectdata.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		
		try {
			System.out.println((Student)i.readObject()); // Student object���·� ������ ���̱� ������ ����ȯ �ʿ�
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		} 
	}

}