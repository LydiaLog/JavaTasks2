import java.util.Scanner;

public class FactorialPrint {

	public static void main(String[] args) {
		int value;
		long factValue = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("팩토리얼 n 값을 입력하시오 : ");
		value = scan.nextInt();// 팩토리얼 n 값을 입력 받아 변수 value에 저장
		
		for(int i = 1; i <= value; i++) {
			factValue *= i; // 1 ~ value 팩토리얼 값 누적
		}
		
		System.out.println(value + "!" + " = " + factValue);

	}

}
