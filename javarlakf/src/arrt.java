/*
 * try catch�� �̿��� ����ó��
 */
import java.util.Scanner;
public class arrt {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		Scanner s = new Scanner(System.in); //���� 10���� �Է¹ޱ� ���� Scanner
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
