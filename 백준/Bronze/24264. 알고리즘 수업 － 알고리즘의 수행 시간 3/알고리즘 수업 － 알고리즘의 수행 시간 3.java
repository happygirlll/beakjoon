import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        long count = n*n;

        // 최고차항 차수 계산
        int degree = 2;

        System.out.println(count);
        System.out.println(degree);
    }
}
