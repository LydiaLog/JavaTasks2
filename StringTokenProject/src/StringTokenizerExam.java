import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String str = "hello java";
		StringTokenizer stk = new StringTokenizer("http://www.hallym.ac.kr","://.");

		while( stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		String[] strs = str.split(" ");
		for(int i = 0; i < strs.length; i++)
			System.out.println(strs[i]);
	}

}
