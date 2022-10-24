import java.util.Scanner;
import java.lang.Math;


public class Task3_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double x0, y0, x, y;
		
		System.out.println("x0 y0: ");
		x0 = in.nextDouble();
		y0 = in.nextDouble();
		
		System.out.println("x y: ");
		x = in.nextDouble();
		y = in.nextDouble();
		
		double d = Math.sqrt((x-x0)*(x-x0) + (y-y0)*(y-y0));
		System.out.println("Distance: " + d);
		
		System.out.println("a b c: ");
		double a,b,c;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		d = Math.abs(a*x0 + b*y0 + c) / Math.sqrt(a*a + b*b);
		System.out.println("Distance: " + d);
		
		do {
			System.out.println("a b c: ");
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
		} while (a*b == 1.0);
		
		y = (1-a)*c/(a*b-1);
		x = (1-b)*c/(a*b-1);
		d = Math.sqrt((x-x0)*(x-x0) + (y-y0)*(y-y0));
		System.out.println("Distance: " + d);
	}

}
