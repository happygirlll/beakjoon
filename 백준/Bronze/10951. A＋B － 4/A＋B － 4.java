import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 저장용

        String line; // 한 줄씩 읽어오기 위한 변수
        while ((line = br.readLine()) != null) { // EOF 처리
            String[] input = line.split(" "); // 공백으로 분리
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            sb.append(a + b).append("\n"); // 결과 저장
        }

        System.out.print(sb.toString()); // 결과 출력
    }
}
