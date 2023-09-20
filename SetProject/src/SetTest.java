/*
 * Set 컬렉션 예시 작성
 * Set 컬렉션은 원소 중복 허용이 안 되는 것이 특징
 * HashSet - 성능 가장 우수, 순서 일정 X
 * TreeSet - 값에 따라 순서 결정, HashSet보다 느림
 * LinkedHashSet - 삽입되었던 순서대로 원소들의 순서 결정
 */
import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
	 	Set<String> s2 = new HashSet<String>();

		s1.add("kim");
		s1.add("lee");
		s1.add("park");
		//s1은 중복 없음
		s2.add("choi");
		s2.add("han");
		s2.add("kim");
		//s2도 중복 없음

		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2); 
		/*
		 * addAll은 합집합 의미
		 * union을 union과 s2의 합집합으로 만들기
		 * HashSet은 중복 허용이 X
		 * 합집합에서 중복 값은 하나만
		 */
		
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2); 
		/*
		 * retainAll은 교집합
		 * intersection을 intersection과 s2의 교집합으로 만들기 
		 */
		
		System.out.println("합집합" + union );
		System.out.println("교집합" + intersection );

	}
}
