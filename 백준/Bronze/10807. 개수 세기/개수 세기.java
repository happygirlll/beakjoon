import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        int v = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int j =0; j < N; j++) {
            if (num[j] == v) {
                sum++;
            }

        }
        System.out.print(sum);
    }
}
