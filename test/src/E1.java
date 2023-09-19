
public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		result(value);

	}
	public static void result(int v) {
		int sum = 0;
		for(int i = v; i >= 0; i--, v++)
			sum +=v;
		System.out.println(sum);
	}

}
