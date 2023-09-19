
public class Point {
	private int x;// xÁÂÇ¥
	private int y;// yÁÂÇ¥
	
	public Point() {
		this(0, 0);
	}
	public Point(int v) {
		this(v, v);
	}
	public Point(int x , int y) {
		if(x < 0 || y < 0) {
			x = y = 0;
		}
		else {
			this.x = x;
			this.y = y;
		}	
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moveBy(int x, int y) {
		this.x += x;
		this.y = this.y + y;
	}
	public String toString() {
		return "x: " + x + "y: " + y;
	}
	
	public boolean equals(Point p) {
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
}
