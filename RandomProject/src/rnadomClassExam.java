import java.util.Random;
import java.util.Scanner;

public class rnadomClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		 Scanner scan = new Scanner(System.in);
		 System.out.println("���� ���� ������ �Է��Ͻʽÿ� : ");
	     int start = scan.nextInt();
	     int end = scan.nextInt();
	     int[] randValue = new int[5];
	     boolean flag = false;
	     int rvalue;
	     
	     for(int i = 0; i <5; i++) {
	    	 flag = false;
	    	 rvalue = r.nextInt(start) + (end - start);
	    	 for(int j = 0; j < i; j++) {
	    		 if(rvalue == randValue[j]) {
	    			 flag = true;
	    			 break;
	    		 }
	    	 }
	    	 if(flag) {
	    		 i--;
	    	 }else{
	    		 randValue[i] = rvalue;
	    	 }
	     }
	     for(int i = 0; i <5; i++) {
	    	 System.out.print(randValue[i] + " ");
	     }

	}

}
