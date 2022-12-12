import java.util.Scanner;

public class Task3_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string  = string.replaceAll("\\b(?<month>\\d{1,2})/(?<day>\\d{1,2})/(?<year>\\d{2,4})\\b", "${day}/${month}/${year}");
        string = string.trim();
        System.out.println(string);
    }
}