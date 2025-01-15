import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);

        if(first == second && first == third) {
            System.out.print(10000+first*1000);
        }
        else if (first == second || first == third) {
            System.out.print(1000 + first * 100);
        }
        else if (second == third) {
            System.out.print(1000 + second * 100);
        }
        else {
            int max = Math.max(first, Math.max(second, third));
            System.out.print(max*100);

        }

    }
}
