
public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student("20211111", "Kim");
		Student s2 = new Student("20211112", "Lee", 1, "computer");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2))
			System.out.println("같은 학생");
		else
			System.out.println("다른 학생");
		
		s2.setStudentNo("20211111");
		s2.setStudentName("Kim");
		
		if(s1.equals(s2))
			System.out.println("같은 학생");
		else
			System.out.println("다른 학생");
		
		

	}

}
