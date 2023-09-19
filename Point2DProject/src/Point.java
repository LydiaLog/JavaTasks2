
public class Point {
	//멤버 변수 - 인스턴스 변수 - static x
	//정적 변수 - 클래스 변수 - static
	//멤버 메서드 - 인스턴스 메서드 - static x
	//정적 메서드 - 클래스 메서드 - static
	
	private int posX; // x좌표 값 저장
	private int posY; // y좌표 값 저장
	
	//초기화 
	public Point(int posX, int posY) {
		//최종적으로 호출되는 생성자
		this.posX = posX;
		this.posY = posY;
	} 
	public Point () {
		//this.posX = 0; 생략 가능
		//this.posY = 0; 
	}
	public Point(int c) {
		/*
		*this.posX = c;
		*this.posY = c;
		*/
		this(c,c); // 또 다른 생성자 호출을 통한 초기화
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
		return "x좌표 : " + posX + " y좌표: " + posY;
	}
	public boolean equals(Object o) {
		// point p1 = new point(10, 10)
		// point p2;
		// p1.equals(p1); 같은 객체 비교 불필요
		if (this == o ) {
			return true;
		}
		// p1.equals(p2);
		if ( o == null) {
			return false;
		}
		//p1.equals(car1); 서로 다른 객체 비교
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
