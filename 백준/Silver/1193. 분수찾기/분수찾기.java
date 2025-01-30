import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine()); // 입력 X

        int k = 1; // 대각선 번호
        while (k * (k + 1) / 2 < X) { // X가 포함될 k를 찾기
            k++;
        }

        int start = k * (k - 1) / 2 + 1; // 해당 대각선의 시작 숫자
        int index = X - start; // 해당 대각선 내에서 X의 위치

        int numerator, denominator;
        if (k % 2 == 1) { // 홀수 번째 대각선이면 분자가 감소
            numerator = k - index;
            denominator = index + 1;
        } else { // 짝수 번째 대각선이면 분자가 증가
            numerator = index + 1;
            denominator = k - index;
        }

        System.out.println(numerator + "/" + denominator); // 결과 출력
    }
}