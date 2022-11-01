import java.util.Arrays;
import java.util.Scanner;

public class Task2_14 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] cols = new int[N], rows = new int[N];
        Arrays.fill(cols, 0);
        Arrays.fill(rows, 0);
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                int el = scan.nextInt();
                cols[j] += el;
                rows[i] += el;
            }
        }

        int counter = 0, c = -1, r = -1;
        for (int i=0; i<N; i++) {
            if (cols[i] % 2 == 1) {
                counter++;
                c = i;
            }
            if (rows[i] % 2 == 1) {
                counter++;
                r = i;
            }
        }

        if (counter == 2) {
            System.out.printf("Треба змінити біт (%d, %d)", r+1, c+1);
        } else if (counter > 2){
            System.out.print("Пошкоджено більше ніж 2 біти");
        } else System.out.print("Матриця парна");
    }
}
