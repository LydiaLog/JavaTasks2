package mylib.lang;

public class MyString {
	private char[] strs; //문자열 저장을 위한 문자 배열
	
	// MyString ms = new MyString("kim")
	public MyString(String str) {
		strs = new char[str.length()];
		for( int i = 0; i < str.length(); i++)
			strs[i] = str.charAt(i);
	}
	//길이 리턴
	public int length() {
		return strs.length;
	}
	//특정 위치 문자열 리턴
	public char charAt(int index) {
		if( index < 0 || index > strs.length) {
			return '\0';
		}
		else {
		return strs[index];
		}
	}
	//부분 문자열
	public String subString(int start, int end) {
		String s = "";
		if( start > end ) {
			return " ";
		}
		if( start <0 || end > strs.length) {
			return " ";
		}
		for(int i = start; i < end; i++)
			s+= strs[i];
		return s;
	}
	public String reverse() {
		String r = "";
		for( int i = strs.length - 1; i >= 0; i--)
			r += strs[i];
		return r;
	}
}
