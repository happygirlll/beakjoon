import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값 받기
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        // 최소 거리 계산
        int minDistance = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        
        // 결과 출력
        System.out.println(minDistance);
        
        sc.close();
    }
}
