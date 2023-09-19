
public class Employee {
	// 멤버 변수 -> 클래스 멤버 -> 클래스 이름.멤버
	//            인스턴스 멤버 -> new로 생성 후 사용 -> 객체변수, 멤버
	//멤버 메서드 -> 클래스 메서드 static이 붙은 메서드 - 클래스 멤버의 사용
	//             인스턴스 메서드 static X        - 인스턴스 멤버의 사용
	
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
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + pay);
		System.out.println("전화번호 : " + telNo);
		System.out.println("연봉 : " + yearpay);
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
