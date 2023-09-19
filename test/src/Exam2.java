
public class Exam2 {
	private static int end;
	private int start;
	
	public Exam2(int s) {
		this.start = s;
	}
	public static void setEnd(int v) {
		end = v;
	}
	public void printValues() {
		int flag;
		int i;
		while(end >= start) {
			flag = 0;
			for (i = 2; i < end; i++)
				if (end %i==0) {
					flag = 1;
					break;
				}
			if(flag == 0)
				System.out.println(i + " ");
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2 e1 = new Exam2(3);
		Exam2.setEnd(7);
		e1.printValues();

	}

}
