/*
 * 클래스를 객체 단위로 저장 => output
 * 읽어오는 부분 => Input
 */
import java.io.*;

public class ObjectOutInTest {

	public static void main(String[] args) {
		Student s = new Student("kim", 21, 1, 4.2f);
		/*객체를 저장하려면 저장할 객체가 implements Serializable이어야 함
		 * Student클래스에 적용함
		 */
		
		ObjectOutputStream o = null;
		ObjectInputStream i = null;
		
		try {
			o = new ObjectOutputStream(new FileOutputStream("objectdata.dat"));
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException ioe) {
			System.out.println("파일을 만들 수 없습니다.");
		}
		try {
			o.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 쓸 수 없습니다.");
		}
		
		try {
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 닫을 수 없습니다.");
		}
		
		try {
			i = new ObjectInputStream(new FileInputStream("objectdata.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 만들 수 없습니다.");
		}
		
		try {
			System.out.println((Student)i.readObject()); // Student object형태로 가져온 것이기 때문에 형변환 필요
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} 
	}

}