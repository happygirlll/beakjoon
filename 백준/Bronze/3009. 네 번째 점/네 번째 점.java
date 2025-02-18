import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] points = new int[3][2];

        for (int i = 0; i < 3; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int x4 = points[0][0] ^ points[1][0] ^ points[2][0];
        int y4 = points[0][1] ^ points[1][1] ^ points[2][1];

        System.out.println(x4 + " " + y4);
        
        sc.close();
    }
}
