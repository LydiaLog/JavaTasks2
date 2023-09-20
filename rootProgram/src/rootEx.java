import java.lang.Math; //lang 패키지는 기본 import

import java.util.Scanner;

public class rootEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     System.out.print("a : ");
	     int a = scan.nextInt();
	     System.out.print("b : ");
	     int b = scan.nextInt();
	     System.out.print("c : ");
	     int c = scan.nextInt();
	        
	        double x1 = 0.0;
	        double x2 = 0.0;
	        
	        x1 = (-b + Math.sqrt(Math.pow(b ,2) - 4*a*c))/(2 * a);
	        x2 = (-b - Math.sqrt(Math.pow(b ,2) - 4*a*c))/(2 * a);
	        
	        System.out.println("x1 = "+ x1 + " , x2 = "+ x2);
	        
	}

}
