
public class ArrayTest {

	public static void main(String[] args) {
		//int oneDimArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//선언과 동시에 초기화
		int oneDimArray[] = new int[10];
		int otherDimArray[] = oneDimArray;
		//otherArray == oneDimArray
		int sum = 0;
		
		for(int i = 0; i < oneDimArray.length; i++) {
			oneDimArray[i] = (i + 1);
		}
		
		print(oneDimArray);
		System.out.println("배열 합 : " + sumArray(oneDimArray));
	}
	public static void print(int otherArray[]) {
		for(int i = 0; i < otherArray.length; i++ ) {
			System.out.println("배열["+ i + "]" + otherArray[i]);
		}
			
	}
	public static int sumArray(int otherArray[]) {
		int sum = 0;
		for(int i = 0; i < otherArray.length; i++) {
			sum += otherArray[i];
		}
		return sum;
	}

}
