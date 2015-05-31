//import java.io;
import java.util.Scanner;
import java.math.*;



public class Global {
	public static void main( String args[] ) 
		throws java.io.IOException {

		double a, b, c, D, x1, x2, sqrtD;
		
  		Scanner in = new Scanner(System.in);
  				
		System.out.println("я решаю квадратные уравнени€!!!1111");
		System.out.println("”равнение имеет вид: ax^2 + bx + c = 0");
		System.out.println("x1 и x2 - корни уравнени€, a, b, c - константы.");

		System.out.println("¬ведите значение a");  
		a = in.nextDouble();
		System.out.println("¬ведите значение b");
		b = in.nextDouble();
		System.out.println("¬ведите значение c");
		c = in.nextDouble();	
		System.out.printf("”равнение имеет вид: %dx^2 + %dx + %d = 0 \n", a, b, c );
	
		D = b*b + 4*a*c;
		System.out.println("«начение дискриминанта равно D = " +D);
		
		sqrtD = Math.sqrt(D);
		x1 = (-b + sqrtD)/(2*a); 
		
//		x1 = ( -b - sqrt(D) )/( 2 * a );
		
		


		

	}
}
	
