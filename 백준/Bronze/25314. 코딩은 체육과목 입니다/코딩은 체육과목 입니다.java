import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder result = new StringBuilder();

        // N / 4 만큼 "long"을 추가
        for (int i = 0; i < N / 4; i++) {
            result.append("long ");
        }

        result.append("int");

        System.out.println(result.toString());
    }
}