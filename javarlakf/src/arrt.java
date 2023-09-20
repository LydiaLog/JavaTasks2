/*
 * try catch를 이용한 예외처리
 */
import java.util.Scanner;
public class arrt {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		Scanner s = new Scanner(System.in); //정수 10개를 입력받기 위한 Scanner
		int count = s.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println(array[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
