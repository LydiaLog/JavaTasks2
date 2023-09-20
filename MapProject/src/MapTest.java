/*
 * Map은 키에 값 매핑
 */
import java.util.*;

class Student {
    int number;
    String name;

    public Student(int number , String name) {
    	this.number = number;
    	this.name = name;
    }
    public String toString() {
    	return "이름 " + name;
    }
}
public class MapTest {
    public static void main(String[] args) {
    	Map<String,Student> st = new HashMap<String, Student>();
    	st.put("20090001" , new Student(20090001,"구준표"));
    	st.put("20090002" , new Student(20090002,"금잔디"));
    	st.put("20090003" , new Student(20090003,"윤지후"));
	
    	System.out.println(st);//항목 모두 출력
    	
    	st.remove("20090002"); //항목 하나 출력 
    	
    	st.put("20090004" , new Student(20090004,"소이정")); //항목 하나 대치
    	
    	System.out.println(st.get("20090004")); //값 참조
    	//모든 항목 방문
    	for (Map.Entry<String , Student> s : st.entrySet()) {
    		String key = s.getKey();
    		Student value = s.getValue();
    		System.out.println("Key=" + key + ", value=" + value);
    	}
    }
}