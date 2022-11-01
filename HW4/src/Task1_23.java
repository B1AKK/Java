
public class Task1_23 {

	public static void main(String[] args) {
        String numbers = args[0];
        while (numbers.length() < 9) {
            numbers = String.join("", "0", numbers);
        }
        int d = -1;
        for (int x = 0; x<=10; x++) {
            int i = 0;
            int sum = x;
            for (String symb: numbers.split("")) {
                sum += (10-i) * Integer.parseInt(symb);
                i++;
            }
            if (sum % 11 == 0) {
                d = x;
                break;
            }
        }
        String pref = "X";
        if (d != 10) {
            pref = Integer.toString(d);
        }
        System.out.print(pref + numbers);
    }

}
