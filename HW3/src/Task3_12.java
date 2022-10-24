import java.util.Scanner;


public class Task3_12 {


	public static void main(String[] args) {
		int[] x = new int[6];
		int[] y = new int[6];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input 4 x coords: ");
		for(int i=0; i<4; i++) x[i] = in.nextInt();
		System.out.println("Input 4 y coords: ");
		for(int i=0; i<4; i++) y[i] = in.nextInt();
		
		x[4] = Math.min(x[0], x[1]);
		y[4] = Math.min(y[0], y[1]);
		x[5] = Math.max(x[2], x[3]);
		y[5] = Math.max(y[2], y[3]);
		
		System.out.printf("(%d, %d) (%d, %d)", x[4], y[4], x[5], y[5]);
	}

}
