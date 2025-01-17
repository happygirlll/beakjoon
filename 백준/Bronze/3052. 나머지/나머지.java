import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] remainders = new boolean[42]; // 0~41까지의 나머지를 저장
        int count = 0;

        // 입력값 처리
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int remainder = n % 42; // 나머지 계산

            // 나머지가 처음 등장하면 count 증가
            if (!remainders[remainder]) {
                remainders[remainder] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}