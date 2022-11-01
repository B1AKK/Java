import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Abiturient {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private String address;
    private int[] marks;
    private int score = 0;

    public Abiturient() {}

    public Abiturient(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Abiturient(long id, String surname, String name, String patronymic, String phoneNumber, String address, int[] marks) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.marks = marks.clone();
        for (int m: marks) score += m;
    }

    public Abiturient(long id, String surname, String name, int[] marks) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.marks = marks.clone();
        for (int m: marks) score += m;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        for (int m: marks) score += m;
    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.join(" ", name, surname);
    }

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 5;
        int marksN = 5;
        int markLimit = 12;
        int badMark = 3;
        Abiturient[] studs = new Abiturient[n];
        for (int i = 0; i < n; i++) {
            int[] marks = new int[marksN];
            for (int j = 0; j < marksN; j++) {
                marks[j] = rand.nextInt(markLimit)+1;
            }
            studs[i] = new Abiturient(rand.nextLong(), "name" + (i + 1), "surname" + (i + 1), marks);
        }

        System.out.println("Bad students:");
        for (Abiturient stud : studs) {
            int[] marks = new int[marksN];
            marks = stud.getMarks();
            for (int mark : marks) {
                if (mark <= badMark) {
                    System.out.println(stud + " with mark: " + mark);
                    break;
                }
            }
        }

        System.out.print("Score you looking for: ");
        int goodScore = scan.nextInt();
        System.out.println("\nStudents, having this score: ");
        for (Abiturient stud : studs) {
            int score = stud.getScore();
            if (score > goodScore) System.out.println(stud + " score: " + score);
        }

        System.out.println("\nHalf-good score: ");
        for (Abiturient stud: studs) {
            int score = stud.getScore();
            if (score > goodScore/2) System.out.println(stud + " score: " + score);
        }

        System.out.print("\nInput how many best students you want to see: ");
        int nBest = scan.nextInt();
        Arrays.sort(studs, Comparator.comparing(Abiturient::getScore));
        for (int i=n-1; i>n-nBest-1; i--) {
            System.out.println(studs[i] + " score: " + studs[i].getScore());
        }
    }

}
