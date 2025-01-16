import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            bw.write((a + b) + "\n"); // 결과를 BufferedWriter에 저장
        }

        bw.flush(); // 버퍼에 남아 있는 데이터를 출력
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}