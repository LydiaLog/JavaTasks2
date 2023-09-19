
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
		return super.toString() + " ����: " + price + ", ���ݻ�: " + madeBy;
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
		// System.out.println(getArtist()); ���
		// printTitle();
		// printSongs();
		System.out.println( "������: "+ getArtist() ); // �θ� Ŭ������ �����̹Ƿ� getArtist() �̿�
		System.out.println( "�ٹ���: " + getAlbum() ); // �θ� Ʋ������ �����̹Ƿ� getAlbum() �̿� 
		//���� �ΰ��� ���ļ� System.out.println(super.toString()); �̷��� �ᵵ �� �� ����
		System.out.println( "���: " + getIndex() );
		System.out.print("��: ");
		super.printSongs(); // �θ�Ŭ�������� printSongs() �޼��� �ȿ� ����Ʈ���� ���ԵǾ ����Ʈ �� �ٽ� �� �ʿ� ����
		System.out.println( "����: " + this.price ); 
		System.out.println( "���ݻ�: " + this.madeBy ); 
		// ���� �� ���� price�� madeBy��� ������ �ڽ��� ���̴� get�޼��带 ���� �ҷ��� �ʿ� ����  
		
	
		

	}

	@Override
	public void printTitle() {
		System.out.println("Ÿ��Ʋ ��: " + getSongs(TITLE));

	}

}
