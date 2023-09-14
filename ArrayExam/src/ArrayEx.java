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
		
		System.out.println("ã�� �� ����: ");
		inputValue = s.nextInt();
		for(int i = 0; i < arr.length; i++ ) {
			if( inputValue == arr[i]) {
			System.out.println("ã�� ���� �迭[" + i +  "]�� ��ġ");
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
			System.out.print(i + 1 + "��° �迭 �Է�: ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int menuSelect() { 
		Scanner s = new Scanner(System.in);
		int menu;
		System.out.println("\n***********");
		System.out.println("�迭 ó�� ���α׷�");
		System.out.println("***********");
		System.out.println("[1] �迭 �Է�");
		System.out.println("[2] �迭 �˻�");//�����˻�
		System.out.println("[3] �迭 ����");//��������
		System.out.println("[4] �迭 ���");
		System.out.println("[0] ����");
		System.out.print("�޴�����: ");
		menu = s.nextInt();
		
		return menu;
	}

}
