
public class BankTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("1234", "kim", 12000);
		System.out.println(b.toString());
		b.deposit(-20000);
		System.out.println(b);
		//BankAccount���� ���� ó���� �� �Ѿ�� 
		try {
			b.withDraw(450000);
		}catch(InvalidWithdraw iv) {
			iv.withdrawErr();
	}
		System.out.println(b.toString());

	}

}
