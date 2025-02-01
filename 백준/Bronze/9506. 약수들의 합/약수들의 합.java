import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == -1) break;

            int[] div = new int[n / 2]; // 최대 n/2개의 약수를 저장할 배열
            int count = 0; // 현재 약수 개수
            int sum = 0; // 약수의 합

            // 약수 찾기
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    div[count++] = i;
                    sum += i;
                }
            }

            // 완전수 판별
            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < count; i++) {
                    sb.append(div[i]);
                    if (i < count - 1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}