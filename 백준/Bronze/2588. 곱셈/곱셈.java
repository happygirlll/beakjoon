import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();

        int a = num1.charAt(0) - '0', b = num1.charAt(1) - '0', c = num1.charAt(2) - '0';
        int d = num2.charAt(0) - '0', e = num2.charAt(1) - '0', f = num2.charAt(2) - '0';

        int firstSum = c * f + b * f * 10 + a * f * 100;
        int secondSum = c * e + b * e * 10 + a * e * 100;
        int thirdSum = c * d + b * d * 10 + a * d * 100;
        int totalSum = firstSum + secondSum * 10 + thirdSum * 100;

        System.out.println(firstSum);
        System.out.println(secondSum);
        System.out.println(thirdSum);
        System.out.println(totalSum);
    }
}
