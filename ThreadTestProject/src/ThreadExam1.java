/*
 * throws�� �̿��� ����ó��
 * throw�� ���� �߻� ��ų �� ���
 * throws�� ���� �޼ҵ�(���� �޼ҵ�� ȣ���� �޼ҵ�)�� �߻��� ���ܸ� ������
 */
public class ThreadExam1 {

	public static void main(String[] args) throws InterruptedException{
		//throws�� ȣ��� �޼ҵ忡 ���̱�
		//�Ʒ��� �ڵ尡 ����Ǳ� ���ؼ��� ����ó�� �ʿ�
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //������ 1�� ���� ����
		}
		/*
		 * try catch ���
		 * for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try{
			   Thread.sleep(1000);
			}catch(InterruptedExcepton ie){
				System.out.println("���� �߻�");
			}
			
		 */

	}

}
