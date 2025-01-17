import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 바구니 개수 N과 공 넣는 횟수 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] baskets = new int[N];

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine()); // st를 입력받는다. "1 2 3"
            // i와 j는 배열의 인덱스 조정해야 하기 때문에 '-1'해줘야함.
            int i = Integer.parseInt(st.nextToken()) - 1 ; //ex) 문제에서 1번 바구니 → 배열에서 0번 인덱스
            int j = Integer.parseInt(st.nextToken()) - 1; //ex) 문제에서 2번 바구니 → 배열에서 1번 인덱스

            // 이 값은 그대로 배열에 저장되거나 출력되며, 인덱스 조정과는 관련이 없음
            int k = Integer.parseInt(st.nextToken());    // 넣을 공의 번호 3


            // i번부터 j번 바구니까지 k번 공으로 채우기
            for (int idx = i; idx <= j; idx++) {
                baskets[idx] = k;
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket).append(" ");
        }
        System.out.println(sb.toString().trim()); //trim(): 불필요한 공백 제거
    }
}