/*
 * ����ó��
 * ���� Ŭ���� ����ؼ� �����
 */
public class InvalidWithdraw extends Exception { //�ڵ����� ���� �߻� ������ ���� Exception�� ���� 
	//�߰� ����
	private String msg; 
	public InvalidWithdraw(String msg) {
		super(msg); //���� Ŭ������ ���� �ѱ��
		this.msg = msg;
	}
	public void depositErr() {
		System.out.println("�Աݾ��� �߸��Ǿ����ϴ�");
	}
	public void inputErr() {
		System.out.println("�Աݾ��� 0���� �۽��ϴ�");
	}
	public void withdrawErr() {
		System.out.println("��ݾ��� �߸��Ǿ����ϴ�");
	}
	//�߰� �޼���
	
}
