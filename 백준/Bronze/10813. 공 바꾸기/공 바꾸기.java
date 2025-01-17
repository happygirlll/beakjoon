import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 바구니 개수 N과 공 교환 횟수 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 바구니 번호 매기기
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            // i번 바구니와 j번 바구니의 공 교환하기
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;

        }
        
        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket).append(" ");
        }
        System.out.println(sb.toString().trim()); //trim(): 불필요한 공백 제거
    }
}
