/*
 * Set �÷��� ���� �ۼ�
 * Set �÷����� ���� �ߺ� ����� �� �Ǵ� ���� Ư¡
 * HashSet - ���� ���� ���, ���� ���� X
 * TreeSet - ���� ���� ���� ����, HashSet���� ����
 * LinkedHashSet - ���ԵǾ��� ������� ���ҵ��� ���� ����
 */
import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
	 	Set<String> s2 = new HashSet<String>();

		s1.add("kim");
		s1.add("lee");
		s1.add("park");
		//s1�� �ߺ� ����
		s2.add("choi");
		s2.add("han");
		s2.add("kim");
		//s2�� �ߺ� ����

		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2); 
		/*
		 * addAll�� ������ �ǹ�
		 * union�� union�� s2�� ���������� �����
		 * HashSet�� �ߺ� ����� X
		 * �����տ��� �ߺ� ���� �ϳ���
		 */
		
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2); 
		/*
		 * retainAll�� ������
		 * intersection�� intersection�� s2�� ���������� ����� 
		 */
		
		System.out.println("������" + union );
		System.out.println("������" + intersection );

	}
}
