
public class ClassTest {

	public static void main(String[] args) {
		MusicCD m1 = new MusicCD("psy", "champion", 10, 12000, "sony");
		MusicCD m2 = new MusicCD("조PD", "친구여", 8, 11000, "sony");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println( ); //콘솔창에 m1, m2가 정리되어 보였으면 좋겠어서 추가
	
		
		if( m1.equals(m2)) { 
			System.out.println("같은 음반");
		}
		else {
			System.out.println("다른 음반");
		}
		
		System.out.println(m1.toString());
		
		m1.addSong("새");
		m1.addSong("챔피언");
		m1.addSong("강남스타일");
		m1.PrintAlbumInfo();
		m1.setArtist("싸이");
		m1.printTitle();
		
		System.out.println(m1); //m1.setArtist("싸이");이 실행되었나 확인하려고 출력문 추가
		                        //m1.PrintAlbumInfo();해도 확인 가능하지만 콘솔창에 보이는 결과가 너무 길어짐

		
	

	}
	}
