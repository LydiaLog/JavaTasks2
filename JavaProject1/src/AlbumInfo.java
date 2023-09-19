
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
		return "가수명 : " + artist + ", 앨범명 : " + album;
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
		if(index < songs.length) { //songs.length 보다 index의 값이 작아야 index 증가
			this.songs[index] = song;
			index++;
		}else { // 반대의 경우 저장 불가 메세지 출력
			System.out.println("더 이상 저장할 수 없습니다");
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
