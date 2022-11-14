import java.util.Scanner;

public class Task6_8 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Train t = new Train();
        
        t.addCar(new DriversCar());
        t.addCar(new TechnicalCar());
        t.addCar(new BaggageCar(50));
        t.addCar(new BaggageCar(100));
        t.addCar(new PassengerCar(35, 7, 20));
        t.addCar(new PassengerCar(50, 4, 40));
        t.addCar(new PassengerCar(74, 2, 40));
        
        t.print();
        System.out.println("\nSorted by comfort:");
        t.sortByComfort();
        t.print();

        System.out.print("\nSearching for cars with number of passangers from: ");
        int a = scan.nextInt();
        System.out.print("to: ");
        int b = scan.nextInt();
        Train res = t.searchByPassangers(a, b);
        res.print();
    }
}
