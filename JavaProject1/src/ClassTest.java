
public class ClassTest {

	public static void main(String[] args) {
		MusicCD m1 = new MusicCD("psy", "champion", 10, 12000, "sony");
		MusicCD m2 = new MusicCD("��PD", "ģ����", 8, 11000, "sony");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println( ); //�ܼ�â�� m1, m2�� �����Ǿ� �������� ���ھ �߰�
	
		
		if( m1.equals(m2)) { 
			System.out.println("���� ����");
		}
		else {
			System.out.println("�ٸ� ����");
		}
		
		System.out.println(m1.toString());
		
		m1.addSong("��");
		m1.addSong("è�Ǿ�");
		m1.addSong("������Ÿ��");
		m1.PrintAlbumInfo();
		m1.setArtist("����");
		m1.printTitle();
		
		System.out.println(m1); //m1.setArtist("����");�� ����Ǿ��� Ȯ���Ϸ��� ��¹� �߰�
		                        //m1.PrintAlbumInfo();�ص� Ȯ�� ���������� �ܼ�â�� ���̴� ����� �ʹ� �����

		
	

	}
	}
