//import java.io;
import java.util.Scanner;
import java.math.*;



public class Global {
	public static void main( String args[] ) 
		throws java.io.IOException {

		double a, b, c, D, x1, x2, sqrtD;
		
  		Scanner in = new Scanner(System.in);
  				
		System.out.println("� ����� ���������� ���������!!!1111");
		System.out.println("��������� ����� ���: ax^2 + bx + c = 0");
		System.out.println("x1 � x2 - ����� ���������, a, b, c - ���������.");

		System.out.println("������� �������� a");  
		a = in.nextDouble();
		System.out.println("������� �������� b");
		b = in.nextDouble();
		System.out.println("������� �������� c");
		c = in.nextDouble();	
		System.out.printf("��������� ����� ���: %dx^2 + %dx + %d = 0 \n", a, b, c );
	
		D = b*b + 4*a*c;
		System.out.println("�������� ������������� ����� D = " +D);
		
		sqrtD = Math.sqrt(D);
		x1 = (-b + sqrtD)/(2*a); 
		
//		x1 = ( -b - sqrt(D) )/( 2 * a );
		
		


		

	}
}
	
