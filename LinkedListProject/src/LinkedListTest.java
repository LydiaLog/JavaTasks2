/*
 * LinkedList�� ���԰� ������ ����ϰ� �Ͼ�� ��� ���
 * �迭�� �׻� 0���� �����ϴ� �� ����
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
		
		l.add(1, "University"); // ù ��° �ε����� University �߰�
		for(int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		
		System.out.println();
		
		l.set(3, "Engineering");
		/*
		 * ArrayList���� ���������� 
		 * �տ��� ù ���� �ε����� University�� �߰������Ƿ�
		 * �迭�� �ε����� ù ��° �ε��� ���ķ� �ϳ��� �и�
		 * ��, Science�� �ε��� ���� 2 -> 3
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
