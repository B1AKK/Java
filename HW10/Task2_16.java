public class Task2_16 {
    public static void main(String[] args) {
        String seq = "abc";
        String string = "fgabglabcleabcirabcgbv";
        String string_new = string.replaceAll(seq, " ");
        String[] res = string_new.split(" ");
        System.out.println("Result is " + (res.length - 1));
    }
}
