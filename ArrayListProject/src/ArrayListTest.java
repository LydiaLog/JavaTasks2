import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(); //ArrayList<String>�� ���ڿ� ���� ��ü
		
		a.add("Hallym");
		a.add("Computer");
		a.add("Science");
		
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i)); //��ü ���� ���
		
		System.out.println();
		
		a.add(1, "University");
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i));// 1�� �ε����� �� �߰�
		
		System.out.println();
		
		a.set(3, "Enginnering"); 
		/*
		 * ���� Science�� �ε����� 2������ 
		 * university�� 1��° �ε����� �߰������Ƿ� 
		 * ���� 1�� �ε������� �޿� �ϳ��� �ε������� �з���
		 * ��, Science�� �ε����� 3�� ��
		 */
		 
		for(int i = 0; i < a.size(); i ++) 
			System.out.println(a.get(i));// 3�� �ε����� "Science" ���� "Engineering"���� �ٲٱ�
		
		System.out.println();

		Iterator e = a.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		

	}

}
