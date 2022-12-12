import java.io.*;
import java.util.*;

public class Task5_4 {
    public static void main(String[] args) throws IOException {
        File G = new File("G.txt");
        File Fa = new File("Fa.txt");
        File Fb = new File("Fb.txt");
        point_a(G, Fa);
        point_b(G, Fb);
    }

    static void point_a(File f1, File f2) throws IOException{
        Scanner reader = new Scanner(f1);
        FileWriter writer = new FileWriter(f2);
        String data = "";
        while (reader.hasNextInt()){
            int symbol = reader.nextInt();
            if (symbol == 0){
                symbol = 1;
                data += Integer.toString(symbol) + " ";
            } else if (symbol == 1) {
                symbol = 0;
                data += Integer.toString(symbol) + " ";
            }
        }
        writer.write(data);
        writer.close();
    }

    static void point_b(File f1, File f2) throws IOException{
        Scanner reader = new Scanner(f1);
        FileWriter writer = new FileWriter(f2);
        String data = "";
        while (reader.hasNextLine()){
            data += reader.nextLine();
        }
        StringBuilder builder = new StringBuilder();
        builder.append(data);
        builder.reverse();
        data = builder.toString();
        writer.write(data);
        writer.close();
    }
}
