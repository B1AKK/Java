import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Task6_3 {
    public static void writeEven(String from, String to) {
        try (Scanner file = new Scanner(new FileReader(from))) {
            FileWriter fileWriter = new FileWriter(to);
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (num % 2 == 0) fileWriter.write(Double.toString(num));
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeMult3and5(String from, String to) {
        try (Scanner file = new Scanner(new FileReader(from))) {
            FileWriter fileWriter = new FileWriter(to);
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (num % 3 == 0 || num % 5 == 0) fileWriter.write(Double.toString(num));
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isSquare(int number) {
        return Math.pow(Math.sqrt(number), 2) - number < 0.000001;
    }

    public static void writeSquares(String from, String to) {
        try (Scanner file = new Scanner(new FileReader(from))) {
            FileWriter fileWriter = new FileWriter(to);
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (isSquare(num)) fileWriter.write(Double.toString(num));
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeInversed(String from, String to) {
        try (Scanner file = new Scanner(new FileReader(from))) {
            FileWriter fileWriter = new FileWriter(to);
            StringBuilder text = new StringBuilder("");
            while (file.hasNextLine()) {
                text.append(file.nextLine()).append("\n");
            }
            text.reverse();
            fileWriter.write(text.toString());
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeWithoutRepeats(String from, String to) {
        try (Scanner file = new Scanner(new FileReader(from))) {
            FileWriter fileWriter = new FileWriter(to);
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            while (file.hasNextInt()) {
                int num = file.nextInt();
                if (!numbers.contains(num)) {
                    fileWriter.write(Double.toString(num));
                    numbers.add(num);
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
