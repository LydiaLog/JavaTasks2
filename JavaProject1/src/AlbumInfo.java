
public class AlbumInfo {
	private String artist;
	private String album;
	private String[] songs;
	private int index = 0;
	
	public AlbumInfo(String artist, String album) {
		this.artist = artist;
		this.album = album;
		this.songs = new String[10];
		this.index = 0;
	}
	public AlbumInfo(String artist, String album, int songCount) {
		this.artist = artist;
		this.album = album;
		this.songs = new String[songCount];
		this.index = 0;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIndex() {
		return index;
	}
	@Override
	public String toString() {
		return "������ : " + artist + ", �ٹ��� : " + album;
	}

	public boolean equals(AlbumInfo a) {
		if (this.artist == a.artist && this.album == a.album) {
			return true;
		}
		else {
			return false;
		}		
	}	
	
	public void addSong(String song) {
		if(index < songs.length) { //songs.length ���� index�� ���� �۾ƾ� index ����
			this.songs[index] = song;
			index++;
		}else { // �ݴ��� ��� ���� �Ұ� �޼��� ���
			System.out.println("�� �̻� ������ �� �����ϴ�");
		}
	}
	
	public String getSongs(int index) {
		return songs[index];
	}
	  
	public void printSongs() {
		for(int i = 0; i < songs.length; i++) {
		System.out.println((i + 1) + " - " + songs[i]);
		}
	}
	


}
