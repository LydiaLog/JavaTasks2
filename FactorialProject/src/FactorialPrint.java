import java.util.Scanner;

public class FactorialPrint {

	public static void main(String[] args) {
		int value;
		long factValue = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���丮�� n ���� �Է��Ͻÿ� : ");
		value = scan.nextInt();// ���丮�� n ���� �Է� �޾� ���� value�� ����
		
		for(int i = 1; i <= value; i++) {
			factValue *= i; // 1 ~ value ���丮�� �� ����
		}
		
		System.out.println(value + "!" + " = " + factValue);

	}

}
