import java.util.Scanner;

public class Task4_19 {

	public static void main(String[] args) {
		int tmp, n = -1;
		
		Scanner in = new Scanner(System.in);
		do {
			tmp = in.nextInt();
			n++;
		} while (tmp < 0);
		
		System.out.println(n);
	}

}
