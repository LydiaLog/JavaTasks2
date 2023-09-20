import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(); //ArrayList<String>은 문자열 저장 객체
		
		a.add("Hallym");
		a.add("Computer");
		a.add("Science");
		
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i)); //객체 내용 출력
		
		System.out.println();
		
		a.add(1, "University");
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i));// 1번 인덱스에 값 추가
		
		System.out.println();
		
		a.set(3, "Enginnering"); 
		/*
		 * 원래 Science의 인덱스는 2이지만 
		 * university를 1번째 인덱스에 추가했으므로 
		 * 원래 1번 인덱스부터 쭈욱 하나씩 인덱스값이 밀려남
		 * 즉, Science의 인덱스가 3이 됨
		 */
		 
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i));// 3번 인덱스의 "Science" 값을 "Engineering"으로 바꾸기
		
		System.out.println();

		Iterator e = a.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		

	}

}
