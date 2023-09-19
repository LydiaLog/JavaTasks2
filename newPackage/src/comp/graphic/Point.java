package comp.graphic;

public class Point {
	private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.x;
    }
    public String toString() {
        return "x:" + this.x + " y:" + this.y;
    }
    public boolean equals(Object o) {
       if( o instanceof Point ) {
           Point p = (Point)o;
           if( this.x == p.getX() && this.y == p.getY() )
             return true;
           else
             return false;
       }
       return false;
     }

}
