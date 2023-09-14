
public class TeoDimArray {

	public static void main(String[] args) {
		
		int twoDim[][] = new int[3][];
		int cnt = 1;
		/* ¹æ¹ý1
		twoDim[0] =new int[] {1, 2, 3};
		twoDim[1] = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		twoDim[2] = new int[] {14, 15};
		*/
		twoDim[0] =new int[3];
		twoDim[1] = new int[10];
		twoDim[2] = new int[2];
		
		for(int i = 0; i < twoDim.length; i++ ) {
			for(int j = 0; j < twoDim[i].length; j++) {
				twoDim[i][j] = cnt++;
			}
		}
		for(int i = 0; i < twoDim.length; i++ ) {
			for(int j = 0; j < twoDim[i].length; j++) {
				System.out.print(twoDim[i][j] + " ");
			}
			System.out.println();
		}


	}

}
