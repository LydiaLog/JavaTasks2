
public class Point {
	//��� ���� - �ν��Ͻ� ���� - static x
	//���� ���� - Ŭ���� ���� - static
	//��� �޼��� - �ν��Ͻ� �޼��� - static x
	//���� �޼��� - Ŭ���� �޼��� - static
	
	private int posX; // x��ǥ �� ����
	private int posY; // y��ǥ �� ����
	
	//�ʱ�ȭ 
	public Point(int posX, int posY) {
		//���������� ȣ��Ǵ� ������
		this.posX = posX;
		this.posY = posY;
	} 
	public Point () {
		//this.posX = 0; ���� ����
		//this.posY = 0; 
	}
	public Point(int c) {
		/*
		*this.posX = c;
		*this.posY = c;
		*/
		this(c,c); // �� �ٸ� ������ ȣ���� ���� �ʱ�ȭ
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
    //@Override
	public String toString() {
		return "x��ǥ : " + posX + " y��ǥ: " + posY;
	}
	public boolean equals(Object o) {
		// point p1 = new point(10, 10)
		// point p2;
		// p1.equals(p1); ���� ��ü �� ���ʿ�
		if (this == o ) {
			return true;
		}
		// p1.equals(p2);
		if ( o == null) {
			return false;
		}
		//p1.equals(car1); ���� �ٸ� ��ü ��
		if ( this.getClass() != o.getClass() ) {
			return false;
		}
		
		Point p = (Point)o;
		
		if(this.posX != p.posX ) {
			return false;
		}
		if(this.posY != p.posY) {
			return false;
	   } 
		
		return true;
		}
	

	 
	  

	
}
