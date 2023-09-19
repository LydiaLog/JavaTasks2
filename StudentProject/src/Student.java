import java.util.Objects;

/*
 * �л� ���� ������ ���� Ŭ����
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
		this.dept = "���� ����";
		this.grade = 0;
		*/
		this(studentNo, studentName, 0, "���� ����");
		
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
		return "�л� ���� : [�й� =" + studentNo + ", �̸� =" + studentName + ", �г� =" + grade + ", �а� ="
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
		 *  ���� ����
		 */
		return Objects.equals(studentName, other.studentName) && Objects.equals(studentNo, other.studentNo); // �ֽ� ����
	}
	
	

}
