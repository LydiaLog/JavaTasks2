
public class Manager extends Employee {
	
	private int allowance;
	
	public Manager(String name, int pay, String telNo, int allowance) {
		super(name, pay, telNo);
		this.allowance = allowance;
	}
	public long calIncome(int pay) {
		return super.calIncome() + allowance;
	}
	public int getAllowance() {
		return allowance;
	}
	public void dispaly() {
		super.display();
		System.out.println("¼ö´ç : " + allowance);
	}

}
