/*
 * LinkedList는 삽입과 삭제가 빈번하게 일어나는 경우 사용
 * 배열은 항상 0부터 시작하는 것 주의
 */
import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Hallym");
		l.add("Computer");
		l.add("Science");
		
		for(int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		
		System.out.println();
		
		l.add(1, "University"); // 첫 번째 인덱스에 University 추가
		for(int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		
		System.out.println();
		
		l.set(3, "Engineering");
		/*
		 * ArrayList때와 마찬가지로 
		 * 앞에서 첫 번쩨 인덱스에 University를 추가했으므로
		 * 배열의 인덱스가 첫 번째 인덱스 이후로 하나씩 밀림
		 * 즉, Science의 인덱스 값은 2 -> 3
		 */
		for(int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		
		System.out.println();
		
		Iterator e = l.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
	

	}

}
