import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder 생성

        for (int i =0; i<T; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            sb.append(a + b).append("\n"); // 결과를 StringBuilder에 저장
        }
        System.out.print(sb.toString());

    }
}
