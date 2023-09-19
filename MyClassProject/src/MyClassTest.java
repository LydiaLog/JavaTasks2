
public class MyClassTest {

	public static void main(String[] args) {
		MyClass m1 = new MyClass("Kim", 21, 1, 4.3);
		MyClass m2 = new MyClass("Lee", 22, 3);
		
		System.out.println(m1);
		System.out.println(m2);
		
		m1.increaseGrade();
		m1.increaseAge();
		
		System.out.println(m1);
		
		m2.setCredit(3.8);
		
		System.out.println(m2);

	}

}
