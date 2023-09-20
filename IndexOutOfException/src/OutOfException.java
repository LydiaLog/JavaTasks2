/*
 * try catch를 이용한 예외처리
 */
import java.util.Scanner;
public class OutOfException {

	public static void main(String[] args) {
		int arrs[] = new int[10];
		Scanner s = new Scanner(System.in); //정수 10개를 입력받기 위한 Scanner
		int index;
		
		System.out.println("정수 10개를 입력하세요 : ");
		for(int i = 0; i < 10; i++) {
			arrs[i] = s.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arrs[i] + " ");
		}
		do {
			System.out.println("출력할 배열의 인덱스를 입력하세요 : ");
			index = s.nextInt();
			if(index == -1)
				break;
			try {
			System.out.println(">>> 배열 [" + index + "] 의 값 : " + arrs[index]); // 예외 처리 하기 전에 이 문장에서 오류 발생
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("배열의 인덱스 " + index + "값은 배열 범위를 벗어났습니다");
			} 
		}while(true);

	}

}
