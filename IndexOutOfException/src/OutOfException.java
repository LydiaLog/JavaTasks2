/*
 * try catch�� �̿��� ����ó��
 */
import java.util.Scanner;
public class OutOfException {

	public static void main(String[] args) {
		int arrs[] = new int[10];
		Scanner s = new Scanner(System.in); //���� 10���� �Է¹ޱ� ���� Scanner
		int index;
		
		System.out.println("���� 10���� �Է��ϼ��� : ");
		for(int i = 0; i < 10; i++) {
			arrs[i] = s.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arrs[i] + " ");
		}
		do {
			System.out.println("����� �迭�� �ε����� �Է��ϼ��� : ");
			index = s.nextInt();
			if(index == -1)
				break;
			try {
			System.out.println(">>> �迭 [" + index + "] �� �� : " + arrs[index]); // ���� ó�� �ϱ� ���� �� ���忡�� ���� �߻�
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("�迭�� �ε��� " + index + "���� �迭 ������ ������ϴ�");
			} 
		}while(true);

	}

}
