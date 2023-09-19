
public class PointEx {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		System.out.println(p.toString());
		Point3D p3d1 = new Point3D(10,20,30);
		Point3D p3d2 = new Point3D(10,20,30);
		
		if( p3d1.equals(p3d2)) {
			System.out.println("°°Àº ÁÂÇ¥");
		}
		else {
			System.out.println("´Ù¸¥ ÁÂÇ¥");
		}
		System.out.println(p3d1.toString());
		p3d1.moveBy(5, 5, -5);
		System.out.println(p3d1.toString());
	}

}
