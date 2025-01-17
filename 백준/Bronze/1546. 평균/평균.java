import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        double[] scores = new double[N];
        double max = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(input[i]);
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        // 새로운 점수 합 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (scores[i] / max) * 100;
        }
        double newAverage = sum / N;
        System.out.printf("%f", newAverage);
    }
}
