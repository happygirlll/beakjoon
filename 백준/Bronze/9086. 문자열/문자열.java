import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String inputString = br.readLine();

            // StringBuilder를 사용해 첫 문자와 마지막 문자 연결
            StringBuilder sb = new StringBuilder();
            sb.append(inputString.charAt(0)); // 첫 문자 추가
            sb.append(inputString.charAt(inputString.length() - 1)); // 마지막 문자 추가

            // 결과 출력
            System.out.println(sb.toString());
        }
    }
}
