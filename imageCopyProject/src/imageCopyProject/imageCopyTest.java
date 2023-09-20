/*
 * FileInputStream과 FileOutputStream을 이용해 이미지 파일을 다른 이름으로 복사하는 프로그램
 */
package imageCopyProject;

import java.io.*;
public class imageCopyTest {

	public static void main(String[] args) {
		FileInputStream fin = null; //원본 파일에 대한 inputStream
		FileOutputStream fout = null; // 새로 복사본이 만들어질 outputStream
		byte[] temp = new byte[500]; // 500byte씩 복사
		
		try {
		fin = new FileInputStream("source.jpeg");
		fout = new FileOutputStream("copy.jpeg");
		}catch(FileNotFoundException fnfe){
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		while(true) {
			int t = 0;
			try {
				t = fin.read(); //예외 발생
			}catch(IOException ioe) {
				System.out.println("파일을 읽을 수 없습니다.");
			}
			if(t == -1) {
				System.out.println("파일 복사를 마쳤습니다.");
				break;
			}
			try{
			fout.write(t); // 예외 발생
			}catch(IOException ioe) {
				System.out.println("파일을 저장할 수 없습니다.");
			}
		}
		try {
			fin.close();
			fout.close(); //예외 같이 처리
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일을 닫는데 문제가 발생했습니다.");
		}
		
	}

}
