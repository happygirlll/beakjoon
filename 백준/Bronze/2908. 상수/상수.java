import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        String a = input[0];
        String b = input[1];

        int reverseA = reverseNumber(a);
        int reverseB = reverseNumber(b);

        System.out.println(Math.max(reverseA, reverseB));
    }

    private static int reverseNumber(String num) {
        String reversed = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed += num.charAt(i); // 문자열의 뒤에서 앞으로 읽음
        }
        return Integer.parseInt(reversed); // 정수로 변환
    }
}
