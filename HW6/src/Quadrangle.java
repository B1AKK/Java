import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Math;

public class Quadrangle {
    public int area, perimeter;
    public String type;

    public Quadrangle() {}

    public Quadrangle(int area, int perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of Quadrangles: ");
        int n = scan.nextInt();
        Quadrangle[] figures = new Quadrangle[n];
        for (int i=0; i<n; i++) {
            figures[i] = new Quadrangle();
            System.out.printf("Input area of Quadrangle #%d: ", i+1);
            figures[i].area = scan.nextInt();
            System.out.printf("Input perimeter of Quadrangle #%d: ", i+1);
            figures[i].perimeter = scan.nextInt();
        }

        double eps = 0.00001;

        for (Quadrangle fig: figures) {
            if (Math.abs(Math.pow(fig.perimeter/4.0, 2) - fig.area) < eps) fig.type = "square";
            else {
                double b = (Math.pow(fig.perimeter/2.0, 2) - 4 * fig.area) / 2;
                double a = fig.area/2.0 - b;
                if (Math.abs(a*b - fig.area) < eps) fig.type = "rectangle";
                else fig.type = "other";
            }
        }

        boolean rect = true, sq = true, other = true;
        Arrays.sort(figures, Comparator.comparing(Quadrangle::getArea));

        for (int i=n-1; i>=0; i--) {
            if (rect && figures[i].type.equals("rectangle")) {
                System.out.println("Biggest rectangle has area " + figures[i].area);
                rect = false;
            } else if (sq && figures[i].type.equals("square")) {
                System.out.println("Biggest square has area " + figures[i].area);
                sq = false;
            } else if (other && figures[i].type.equals("other")) {
                System.out.println("Biggest other figure has area " + figures[i].area);
                other = false;
            }
            if (!rect && !sq && !other) break;
        }

        rect = true;
        sq = true;
        other = true;

        for (int i=0; i<n; i++) {
            if (rect && figures[i].type.equals("rectangle")) {
                System.out.println("Smallest rectangle has area " + figures[i].area);
                rect = false;
            } else if (sq && figures[i].type.equals("square")) {
                System.out.println("Smallest square has area " + figures[i].area);
                sq = false;
            } else if (other && figures[i].type.equals("other")) {
                System.out.println("Smallest other figure has area " + figures[i].area);
                other = false;
            }
            if (!rect || !sq || !other) break;
        }


    }
}
