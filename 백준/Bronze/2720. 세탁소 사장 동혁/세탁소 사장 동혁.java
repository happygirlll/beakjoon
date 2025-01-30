import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int q = N / 25; N %= 25;
            int d = N / 10; N %= 10;
            int n = N / 5;  N %= 5;
            int p = N;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
