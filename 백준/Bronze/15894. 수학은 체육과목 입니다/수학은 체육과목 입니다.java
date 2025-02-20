import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // n의 범위가 크므로 long 사용
        scanner.close();
        
        long perimeter = 4 * n;  // 둘레 공식
        System.out.println(perimeter);
    }
}
