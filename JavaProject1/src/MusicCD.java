
public class MusicCD extends AlbumInfo implements Printable {
	
	private int price;
	private String madeBy;

	public MusicCD(String artist, String album,int songCount, int price, String madeBy ) {
		super(artist, album, songCount);
		this.price = price;
		this.madeBy = madeBy;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + " 가격: " + price + ", 음반사: " + madeBy;
	}
	
	public String getMadeBy() {
		return madeBy;
	}
	
	public boolean equals(MusicCD a) {
		if(this == a) {
			return true;
		}
		if(a == null) {
			return false;
		}
		
		MusicCD c = (MusicCD)a;
		
		if( !super.equals(c)) {
			return false;
		}
		else if(!this.madeBy.equals( getMadeBy() )) {
				return false;
			}
			else {
				return true;
				}
		}
	

	@Override
	public void PrintAlbumInfo() {
		// System.out.println(getArtist()); 출력
		// printTitle();
		// printSongs();
		System.out.println( "가수명: "+ getArtist() ); // 부모 클래스의 변수이므로 getArtist() 이용
		System.out.println( "앨범명: " + getAlbum() ); // 부모 틀래스의 변수이므로 getAlbum() 이용 
		//위의 두개를 합쳐서 System.out.println(super.toString()); 이렇게 써도 될 것 같음
		System.out.println( "곡수: " + getIndex() );
		System.out.print("곡: ");
		super.printSongs(); // 부모클래스에서 printSongs() 메서드 안에 프린트문이 포함되어서 프린트 문 다시 쓸 필요 없음
		System.out.println( "가격: " + this.price ); 
		System.out.println( "음반사: " + this.madeBy ); 
		// 위의 두 줄은 price와 madeBy라는 변수가 자신의 것이니 get메서드를 통해 불러올 필요 없음  
		
	
		

	}

	@Override
	public void printTitle() {
		System.out.println("타이틀 곡: " + getSongs(TITLE));

	}

}
