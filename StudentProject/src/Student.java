import java.util.Objects;

/*
 * 학생 정보 저장을 위한 클래스
 */
public class Student {
	private String studentNo;
	private String studentName;
	private int grade;
	private String dept;
	
	public Student(String studentNo, String studentName) {
		/*
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.dept = "자유 전공";
		this.grade = 0;
		*/
		this(studentNo, studentName, 0, "자유 전공");
		
	}
	public Student(String studentNo, String studentName, int grade, String dept) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.grade = grade;
		this.dept = dept;
		
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "학생 정보 : [학번 =" + studentNo + ", 이름 =" + studentName + ", 학년 =" + grade + ", 학과 ="
				+ dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentName, studentNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		/*
		 *  this.studentName == other.studentName  XXX
		 *  this.studentName.equals(other.studentName) OOO
		 *  옛날 버전
		 */
		return Objects.equals(studentName, other.studentName) && Objects.equals(studentNo, other.studentNo); // 최신 버전
	}
	
	

}
