import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String[] grades = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            System.out.println(grades[score / 10]);
        }

        sc.close();
    }
}
