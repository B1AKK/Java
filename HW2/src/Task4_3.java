

public class Task4_3 {
	static double Rosenbrock2d(double x, double y)
	{
		return 100*(x*x-y)*(x*x-y) + (x-1)*(x-1);
	}
	
	public static void main(String[] args) {
		System.out.println(Rosenbrock2d(5.2, 6));
		System.out.println(Rosenbrock2d(-6.84, 19.6));
		System.out.println(Rosenbrock2d(78140.54515, 8952.00525));
	}

}
