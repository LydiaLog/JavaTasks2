/*
 * ObjectOutput, ObjectInput을 위한 클래스
 */
import java.io.*;

public class Student implements Serializable{
	private String name;
    private int age;
    private int grade;
    private float score;
	public Student(String name, int age, int grade, float score) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", score=" + score + "]";
	}
    
}
