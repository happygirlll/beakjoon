import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 삼각형 조건 체크
            int[] sides = {a, b, c};
            Arrays.sort(sides); // 오름차순 정렬하여 가장 긴 변을 마지막 요소로
            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
                continue;
            }

            // 삼각형의 종류 판별
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        scanner.close();
    }
}
