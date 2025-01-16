import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] result = new int[T];

        for (int i =0; i<T; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            result[i] = a+b;
            sb.append("Case #"+(i+1)+": "+result[i]+"\n");

        }

        System.out.print(sb.toString());
    }
}