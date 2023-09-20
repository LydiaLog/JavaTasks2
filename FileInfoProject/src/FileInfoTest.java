
import java.io.*;

public class FileInfoTest {

  public static void main(String[] args) {
	File f0 = new File("bin/FileClassExam.class");
	File f1 = new File("..");
	System.out.println("f0.getName() = " + f0.getName());	// ������ �̸�
	System.out.println("f1.getPath() = " + f1.getPath());	// ������ ���
	System.out.println("f0.getAbsolutePath() = " + f0.getAbsolutePath());  // ���� ���� ���
	System.out.println("f1.getParent() = " + f1.getParent());	// ������ ���� ���丮
	System.out.println("f0.exists() = " + f0.exists());	// ������ ���� ����
	System.out.println("f0.canWrite() = " + f0.canWrite());	// ���� ���� ����
	System.out.println("f0.canRead() = " + f0.canRead());	// �б� ���� ����
	System.out.println("f1.isDirectory() = " + f1.isDirectory());	// ���丮 ���� ����
	System.out.println("f1.isAbsolute() = " + f1.isAbsolute());	
		// ������ ���� ��� �����Ǿ������� ����
	System.out.println("f0.lastModified() = " + new java.util.Date(f0.lastModified()));
	// ������ ������ �ð� (long ��)
	System.out.println("f0.length() = " + f0.length()); 	// ������ ����
	String[] list = f1.list();
	System.out.println("f1.list() = {"); 	// ���� ��� (���丮�� ���)
	for(int i = 0; i < list.length; i++)
		System.out.println("\t" + list[i]);
	System.out.println("}");
	try {
		System.out.println("f1.getCanonicalPath() = " + f1.getCanonicalPath());
	} catch (Exception e)
	{
		e.printStackTrace();
	}
  }
}