import java.util.Scanner;


public class Task2_20 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] bytes = new int[4];
		
		for(int i=0; i<4; i++)
		{
			bytes[i] = n % 128;
			n /= 128;
		}
		
		String bin;
		for(int i=0; i<4; i++)
		{
			bin = Integer.toBinaryString(bytes[i]);
			bin = ("0000000" + bin).substring(bin.length()) + " ";
			System.out.print(bin);
		}
			
	}
}
