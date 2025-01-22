import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        // 위쪽 삼각형
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }

        // 아래쪽 삼각형
        for (int i = N - 1; i >= 1; i--) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
