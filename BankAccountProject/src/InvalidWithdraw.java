/*
 * 예외처리
 * 예외 클래스 상속해서 만들기
 */
public class InvalidWithdraw extends Exception { //자동으로 예외 발생 나오는 것은 Exception이 포함 
	//추가 변수
	private String msg; 
	public InvalidWithdraw(String msg) {
		super(msg); //상위 클래스에 예외 넘기기
		this.msg = msg;
	}
	public void depositErr() {
		System.out.println("입금액이 잘못되었습니다");
	}
	public void inputErr() {
		System.out.println("입금액이 0보다 작습니다");
	}
	public void withdrawErr() {
		System.out.println("출금액이 잘못되었습니다");
	}
	//추가 메서드
	
}
