/*
 * ���� ���� ǥ�� Ŭ����
 */
public class BankAccount {
	private String accountNo;
	private String owner;
	private int balance;
	
	public BankAccount(String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	//�����
	 public void deposit(int money) {
		 //����ó��
		 try {
		 if (money < 0)
			 
			 throw new InvalidWithdraw("0���� ���� �� �Ա�");
		 this.balance += money;
		 }catch(InvalidWithdraw iv) {
				 iv.inputErr();
				 }	 
	 }
	 public void withDraw(int money) throws InvalidWithdraw{
		 if(balance - money < 0)
			 throw new InvalidWithdraw("�ܾ� ����");
		 this.balance -= money;
	 }
	//���� ���� ���
	public String toString() {
		return "���� ���� : ���� ��ȣ (" + accountNo + ") ������ ("+ owner + ") ���� �ܾ� (" + balance + ") ";
	}
	
}