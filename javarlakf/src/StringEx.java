
public class StringEx {

	public static void main(String[] args) {
		int nArray[] = new int[5];
		try {
			nArray[6] = 1;
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("초과");
		}finally {
			System.out.println("블록");
		}
		
	}

}
