import comp.graphic.Point;
import comp.graphic.PointArray;
// import comp.graphic.*;

public class UseAPackage {

	public static void main(String[] args) {
		PointArray parr = new PointArray(10);
		Point p1 = new Point(3,4);
		Point p2 = new Point(4,4);
		parr.addPoint(p1);
		parr.addPoint(p2);
		
		System.out.println(parr.getPoint(0));

	}

}
