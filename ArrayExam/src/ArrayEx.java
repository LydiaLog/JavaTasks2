import java.util.Scanner;

public class ArrayEx{

	public static void main(String[] args) {
		int selectMenu;
		int arr[] = null;
		do {
			selectMenu = menuSelect();
			switch( selectMenu ) {
			case 0: 
				return;
			case 1:
				arr = inputArray();
				break;
			case 2: 
				findArray(arr);
				break;
			case 3:
				printArray(arr);
				bubbleSort(arr);
				printArray(arr);
				break;
			case 4 :
				printArray(arr);
				break;
			}
			
		}while(true);
	}
	public static void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length; i++ ) {
		for(int j = 0; j < arr.length-1; j++ ){
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		}
	}
	public static void findArray(int arr[]) {
		Scanner s = new Scanner(System.in);
		int inputValue;
		
		System.out.println("찾을 값 선택: ");
		inputValue = s.nextInt();
		for(int i = 0; i < arr.length; i++ ) {
			if( inputValue == arr[i]) {
			System.out.println("찾는 값은 배열[" + i +  "]에 위치");
			}
		}
	}
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(" arr[" + i + "] = " + arr[i]);
			}
	}
	
	public static int[] inputArray() {
		int arr[] = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(i + 1 + "번째 배열 입력: ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int menuSelect() { 
		Scanner s = new Scanner(System.in);
		int menu;
		System.out.println("\n***********");
		System.out.println("배열 처리 프로그램");
		System.out.println("***********");
		System.out.println("[1] 배열 입력");
		System.out.println("[2] 배열 검색");//순차검색
		System.out.println("[3] 배열 정렬");//버블정렬
		System.out.println("[4] 배열 출력");
		System.out.println("[0] 종료");
		System.out.print("메뉴선택: ");
		menu = s.nextInt();
		
		return menu;
	}

}
