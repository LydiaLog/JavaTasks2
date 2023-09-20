/*
 * Queue 자료구조 예시
 * Queue - 먼저 들어온 데이터가 먼저 나가는 구조
 * 즉, FIFO
 */
import java.util.*;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException{ 
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = time; i >= 0; i--) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			System.out.print(queue.remove() + " " );
	 		Thread.sleep(1000); //현재 스레드 1초동안 재우기
	 	}

	}

}
