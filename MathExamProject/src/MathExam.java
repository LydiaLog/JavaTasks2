
public class MathExam {

	public static void main(String[] args) {
		 int i = 8;
	      int j = -5;
	      int max;
	      
	      // Math.log�� �̿��� �ڿ��α� �� ���ϱ�
	      System.out.println("Natural logarithm value of 2 is : " + Math.log(2));
	      // Math.abs�� �̿��� ���밪 ���ϱ�
	      System.out.println("Absolute value of " + i + " is :" + Math.abs(i));
	      System.out.println("Absolute value of " + j + " is :" + Math.abs(j));
	      // Math.ceil�� �̿��� õ�尪 ���ϱ�
	      System.out.println(Math.ceil(10.1));
	      System.out.println(Math.ceil(-42.4));
	      // Math.floor�� �̿��� �ٴڰ� ���ϱ�
	      System.out.println(Math.floor(30.1));
	      // Math.max�� �̿��� ū�� ���ϱ�
	      max = Math.max(20,40);
	      System.out.println("Max value is "+ max);
	      // Math.pow�� �̿��� �¼� ���ϱ�
	      System.out.println(Math.pow(2,2));
	      // Math.sqrt�� �̿��� ��Ʈ�� ���ϱ�
	      System.out.println(Math.sqrt(9));
	      // Math.round�� �̿��� �ݿø��� ���ϱ�
	      System.out.println(Math.round(20.5f));
	      //  Math.random�� �̿��� ������ ���ϱ�
	      System.out.println("Random numbers between 0.0 and 1.0 are,");
	      for( i=0; i < 5 ; i++)
	          System.out.println("Random Number ["+ (i+1) + "] : " + Math.random());
	      System.out.println("Random numbers between 1 and 100 are,");
	      for( i=0; i < 5 ; i++)
	          System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*100));

	}

}
