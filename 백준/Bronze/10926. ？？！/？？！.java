import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String username = br.readLine(); // 아이디 입력 받기
        System.out.println(username + "??!"); // 놀람 출력
    }
}
