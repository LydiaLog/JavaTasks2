import java.util.Scanner;

public class FibonacciPrint {

	public static void main(String[] args) {
		int n; // �Ǻ���ġ n��°�� ������ ����
		int first = 0;
		int second = 1;
		int next = 0;
		int sum = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Ǻ����� ������ ������ ���� �Է��Ͻÿ� : ");
		n = input.nextInt();
			
		while(true) {
			if( i <= 2) {
				System.out.print(i-1);
				sum += (i-1);
			}
			else {
				next = first + second;
				System.out.print(next);
				first = second; // first -> second 
				second = next; // second -> next
				sum += next;
			}
			if(i < n){
				System.out.print(" , ");
			}// ������ ���� �ڿ� ,�� ������ �ʰ� �ϱ� ���� 
			i++;
			if( i > n)
				break;
		}
		System.out.println("\n���� �հ� : " + sum);
	}

}//�������� 10���� �������־� For�� ���� �� O but, ���������� ���� ������ while�� ���
