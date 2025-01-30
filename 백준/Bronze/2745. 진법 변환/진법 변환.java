import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int transform = Integer.parseInt(N, B);

        System.out.println(transform);

        sc.close();
    }
}
