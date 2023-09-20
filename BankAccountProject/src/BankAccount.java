/*
 * 은행 정보 표현 클래스
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
	//입출금
	 public void deposit(int money) {
		 //예외처리
		 try {
		 if (money < 0)
			 
			 throw new InvalidWithdraw("0보다 작은 값 입금");
		 this.balance += money;
		 }catch(InvalidWithdraw iv) {
				 iv.inputErr();
				 }	 
	 }
	 public void withDraw(int money) throws InvalidWithdraw{
		 if(balance - money < 0)
			 throw new InvalidWithdraw("잔액 부족");
		 this.balance -= money;
	 }
	//계좌 정보 찍기
	public String toString() {
		return "계좌 정보 : 계좌 번호 (" + accountNo + ") 예금주 ("+ owner + ") 예금 잔액 (" + balance + ") ";
	}
	
}