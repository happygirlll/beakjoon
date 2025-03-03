import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        
        long count = (n * (n - 1)) / 2;

        System.out.println(count);
        System.out.println(2);
    }
}
