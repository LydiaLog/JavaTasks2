import java.util.StringTokenizer;

public class TokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name=kitae&addr=seoul&page=21";
		StringTokenizer st = new StringTokenizer(query, "&=");
		System.out.println(st.countTokens());
	}

}
