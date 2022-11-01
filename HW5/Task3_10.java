
public class Task3_10 {
    int a, b, c;
    String line = " ";


    public Task3_10(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Task3_10(int a, int b, int c, String line) {
        this(a, b, c);
        this.line = line;
    }

    public void print() {
        System.out.println(a + b + c + line);
    }

    public static void main(String[] args) {
    	Task3_10 smth = new Task3_10(1, 2, 3), another = new Task3_10(4, 5, 6, "line");
        smth.print();
        another.print();
    }

}
