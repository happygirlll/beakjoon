import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1번부터 30번까지의 학생 상태 (false로 초기화)
        boolean[] submitted = new boolean[31]; // 0번 인덱스는 사용하지 않음

        // 28명의 제출 번호 입력 처리
        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            submitted[studentNumber] = true; // 제출한 학생은 true로 표시
        }

        // 제출하지 않은 학생 찾기
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) { // false인 학생만 출력
                System.out.println(i);
            }
        }
    }
}