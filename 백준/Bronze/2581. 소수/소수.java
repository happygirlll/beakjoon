import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());

        // 1. 에라토스테네스의 체를 사용하여 N까지의 모든 소수를 판별
        boolean[] isPrime = sieve(N);

        int sum = 0;
        int minPrime = Integer.MAX_VALUE;

        // 2. M 이상 N 이하의 소수 찾기
        for (int num = M; num <= N; num++) {
            if (isPrime[num]) { // 소수라면
                sum += num; // 합 계산
                minPrime = Math.min(minPrime, num); // 최솟값 갱신
            }
        }

        // 3. 결과 출력
        if (sum == 0) {
            System.out.println("-1"); // 소수가 하나도 없으면 -1 출력
        } else {
            System.out.println(sum);  // 소수의 합 출력
            System.out.println(minPrime); // 최솟값 출력
        }
    }

    // 에라토스테네스의 체: N까지의 모든 소수 판별
    private static boolean[] sieve(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true); // 모든 수를 소수로 가정
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) { // i가 소수이면
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // i의 배수들은 소수가 아님
                }
            }
        }
        return isPrime;
    }
}
