/*
 * throws를 이용한 예외처리
 * throw는 예외 발생 시킬 때 사용
 * throws는 상위 메소드(현재 메소드로 호출한 메소드)로 발생한 예외를 던져줌
 */
public class ThreadExam1 {

	public static void main(String[] args) throws InterruptedException{
		//throws는 호출된 메소드에 붙이기
		//아래의 코드가 실행되기 위해서는 예외처리 필요
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //스레드 1초 동안 재우기
		}
		/*
		 * try catch 사용
		 * for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try{
			   Thread.sleep(1000);
			}catch(InterruptedExcepton ie){
				System.out.println("예외 발생");
			}
			
		 */

	}

}
