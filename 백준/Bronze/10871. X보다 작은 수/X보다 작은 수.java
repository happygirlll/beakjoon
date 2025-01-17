import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 최적화를 위한 StringBuilder 사용
        
        // 첫 번째 입력: N과 X
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        
        // 두 번째 입력: 수열 A
        String[] arrayInput = br.readLine().split(" ");
        
        // X보다 작은 값만 처리
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arrayInput[i]);
            if (num < X) {
                sb.append(num).append(" "); // StringBuilder에 추가
            }
        }
        
        // 결과 출력
        System.out.println(sb.toString().trim()); // StringBuilder에 저장된 결과 출력
    }
}
