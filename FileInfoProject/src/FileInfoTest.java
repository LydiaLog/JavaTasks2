
import java.io.*;

public class FileInfoTest {

  public static void main(String[] args) {
	File f0 = new File("bin/FileClassExam.class");
	File f1 = new File("..");
	System.out.println("f0.getName() = " + f0.getName());	// 파일의 이름
	System.out.println("f1.getPath() = " + f1.getPath());	// 파일의 경로
	System.out.println("f0.getAbsolutePath() = " + f0.getAbsolutePath());  // 파일 절대 경로
	System.out.println("f1.getParent() = " + f1.getParent());	// 파일의 상위 디렉토리
	System.out.println("f0.exists() = " + f0.exists());	// 파일의 존재 여부
	System.out.println("f0.canWrite() = " + f0.canWrite());	// 쓰기 가능 여부
	System.out.println("f0.canRead() = " + f0.canRead());	// 읽기 가능 여부
	System.out.println("f1.isDirectory() = " + f1.isDirectory());	// 디렉토리 인지 여부
	System.out.println("f1.isAbsolute() = " + f1.isAbsolute());	
		// 파일이 절대 경로 지정되었는지의 여부
	System.out.println("f0.lastModified() = " + new java.util.Date(f0.lastModified()));
	// 파일이 수정된 시간 (long 형)
	System.out.println("f0.length() = " + f0.length()); 	// 파일의 길이
	String[] list = f1.list();
	System.out.println("f1.list() = {"); 	// 파일 목록 (디렉토리의 경우)
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