
public class MyClass {
	private String name;
	private int age;
	private int grade;
	private double credit;
	
	public MyClass(String name, int age, int grade, double credit) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		if(credit > 4.5 || credit < 0)
			this.credit = credit;	
		else
			this.credit = credit;
	}
	public MyClass(String name, int age, int grade) {
		this(name, age, grade, 0.0);
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "학생 정보 : [이름 = " + name + ", 나이 = " + age + ", 학년 = " + grade + ", 학점 = " + credit + "]";
	}
	public void increaseGrade() {
		grade++;
	} 
	public void increaseAge() {
		age++;
	} 
	
	
	

}
