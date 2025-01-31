import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) break; // 입력이 없으면 종료

            String[] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            if (a == 0 && b == 0) break; // 입력이 "0 0"이면 종료

            if (b % a == 0) {
                sb.append("factor\n"); // a가 b의 약수
            } else if (a % b == 0) {
                sb.append("multiple\n"); // a가 b의 배수
            } else {
                sb.append("neither\n"); // 둘 다 아님
            }
        }

        System.out.print(sb.toString());
    }
}
