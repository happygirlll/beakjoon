import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 세 개의 막대 길이 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 2. 배열로 정렬해서 가장 긴 변을 찾기
        int[] sides = {a, b, c};
        Arrays.sort(sides);  // 정렬 후 sides[0] <= sides[1] <= sides[2]
        
        // 3. 삼각형 조건 확인 (가장 긴 변 < 나머지 두 변의 합)
        while (sides[0] + sides[1] <= sides[2]) {
            sides[2]--;  // 삼각형이 될 때까지 가장 긴 변을 줄인다.
        }
        
        // 4. 최종적으로 삼각형을 만들 수 있는 가장 큰 둘레 출력
        System.out.println(sides[0] + sides[1] + sides[2]);

        sc.close();
    }
}
