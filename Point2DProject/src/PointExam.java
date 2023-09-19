
public class PointExam {

	public static void main(String[] args) {
		Point p = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(10,20);
		
		System.out.println( p.toString() );
		System.out.println( p2.toString() );
		System.out.println( p3 );
		
		if( p.equals(p3) )  //p3.equals(p)	
			System.out.println("°°Àº ÁÂÇ¥");
		else
			System.out.println("´Ù¸¥ ÁÂÇ¥");
		p.setPosX(10);
		p.setPosY(20);
		
		if( p.equals(p3) )  //p3.equals(p)	
			System.out.println("°°Àº ÁÂÇ¥");
		else
			System.out.println("´Ù¸¥ ÁÂÇ¥");
		System.out.println( p );
		

	}

}
