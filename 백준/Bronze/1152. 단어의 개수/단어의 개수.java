import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim(); // 앞뒤 공백 제거

        // StringTokenizer로 단어 분리
        StringTokenizer st = new StringTokenizer(input, " ");
        System.out.println(st.countTokens()); // 단어 개수 출력
    }
}
