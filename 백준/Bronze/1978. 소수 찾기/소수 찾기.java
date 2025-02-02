import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX = 1000; // 자연수의 최대 범위
    private static boolean[] isPrime = new boolean[MAX + 1]; // 소수 여부 저장 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        calc();

        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 소수 개수 카운트
        int cnt = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime[num]) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    private static void calc() {
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true; // 초기값을 모두 소수(true)로 설정
        }

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false; // 배수는 소수가 아님
                }
            }
        }
    }
}
