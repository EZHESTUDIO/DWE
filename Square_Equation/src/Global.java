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
		System.out.printf("��������� ����� ���: %.2fx^2 + %.2fx + %.2f = 0 \n", a, b, c );
	
		D = b*b + 4*a*c;
		System.out.println("�������� ������������� ����� D = " +D);
		
		sqrtD = Math.sqrt(D);
		x1 = (-b + sqrtD)/(2*a); 
		x2 = (-b - sqrtD)/(2*a); 	
		
		System.out.printf("����� ��������� = %.2f � %.2f", x1, x2 );
		
		


		

	}
}
	
