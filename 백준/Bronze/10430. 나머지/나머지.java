import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        StringBuilder sb = new StringBuilder();
        sb.append((a + b) % c).append("\n")
          .append((a % c + b % c) % c).append("\n")
          .append((a * b) % c).append("\n")
          .append((a % c * b % c) % c);

        System.out.print(sb);
    }
}
