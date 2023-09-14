import java.util.Scanner;

public class FibonacciPrint {

	public static void main(String[] args) {
		int n; // 피보나치 n번째를 저장할 변수
		int first = 0;
		int second = 1;
		int next = 0;
		int sum = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("피보나피 수열의 마지막 항을 입력하시오 : ");
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
			}// 마지막 숫자 뒤에 ,가 나오지 않게 하기 위해 
			i++;
			if( i > n)
				break;
		}
		System.out.println("\n수열 합계 : " + sum);
	}

}//문제에선 10으로 정해져있어 For로 쓰는 것 O but, 정해져있지 않을 때에는 while문 사용
