package comp.graphic;

public class PointArray {
	  private Point[] parr;
	    private int index=0;
	    
	    public PointArray(int size) {
	        parr = new Point[size];
	     }
	     public Point getPoint(int index) {
	        return parr[index];
	     }
	     public void addPoint(Point p) {
	        if(this.index >= parr.length) {
	           System.out.println("�� �̻� �߰��� �� �����ϴ�.");
	        }
	        else {
	           parr[index++] = p;
	           index++;
	           }
	     }
}
