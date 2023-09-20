/*
 * 데이터 입출력 클래스
 */
import java.io.*;

public class DataInOutExam {

	public static void main(String[] args) {
		FileInputStream fin = null; // DataInputStream을 쓰기 위해 필요한 Stream
		FileOutputStream fout = null; //DatOutputStram을 쓰기 위해 필요한 Stream
		//저장을 위한 객체
		DataOutputStream dout = null;
		DataInputStream din = null;
		
		//FileOutputStream을 DataOutputStream이 지정한 자료형 사이즈만큼 잘라 저장
		try {
			/*
			 * fout = new FileOutputStream("data.dat"); 
			 * dout = new DataOutputStream(fout); 
			 * fout은 dout이 필요로 하는 것
			 * 즉, 변수로 접근할 필요가 없이 한 문장으로 표현 가능
			 * 변수 두개 만들 필요 없음
			 */
			dout = new DataOutputStream(new FileOutputStream("data.dat"));
		
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		try {
			dout.writeInt(10);
			dout.writeDouble(3.14);
			dout.writeBoolean(true);
			dout.writeUTF("DataOutputStream예");
		}catch(IOException ioe) {
			System.out.println("데이터 저장에 문제가 발생했습니다.");
		}
		try {
			dout.close();
		} catch (IOException e) {
			System.out.println("데이터를 닫지 못했습니다.");
		}
		try {
			din = new DataInputStream(new FileInputStream("data.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		try {
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		System.out.println(din.readUTF());
		}catch(IOException ioe) {
			System.out.println("데이터를 읽지 못했습니다.");
		}
		try {
			dout.close();
		} catch (IOException e) {
			System.out.println("데이터를 닫지 못했습니다.");
		}
		
	}

}
