
public class Employee {
	// ��� ���� -> Ŭ���� ��� -> Ŭ���� �̸�.���
	//            �ν��Ͻ� ��� -> new�� ���� �� ��� -> ��ü����, ���
	//��� �޼��� -> Ŭ���� �޼��� static�� ���� �޼��� - Ŭ���� ����� ���
	//             �ν��Ͻ� �޼��� static X        - �ν��Ͻ� ����� ���
	
	private String name;
	private int pay;
	private String telNo;
	private long yearpay;
	private static int employeeCount;
	
	public Employee(String name, int pay, String telNo) {
		this.name = name;
		this.pay = pay;
		this.telNo = telNo;
		employeeCount++;
	}
	public long calIncome() {
		yearpay = pay * 12;
		return yearpay;
	}
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("�޿� : " + pay);
		System.out.println("��ȭ��ȣ : " + telNo);
		System.out.println("���� : " + yearpay);
	}
	public void setData(int pay) {
		this.pay = pay;
	}
	public void setData(String telNo){
		this.telNo = telNo;
	}
	public int getPay() {
		return this.pay;
	}
	public static int getEmployeeCount() {
		return employeeCount;
	}

}
