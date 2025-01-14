import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[3];
        int[] num2 = new int[3];

        // 첫 번째 세 자리 수 입력
        String first = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            num1[i] = first.charAt(i) - '0';
        }

        // 두 번째 세 자리 수 입력
        String second = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            num2[i] = second.charAt(i) - '0';
        }
        
        int firstSum = (num1[2] * num2[2]) + (num1[1] * num2[2] * 10) + (num1[0] * num2[2] * 100);
        int secondSum = (num1[2] * num2[1]) + (num1[1] * num2[1] * 10) + (num1[0] * num2[1] * 100);
        int thirdSum = (num1[2] * num2[0]) + (num1[1] * num2[0] * 10) + (num1[0] * num2[0] * 100);
        System.out.println(firstSum);
        System.out.println(secondSum);
        System.out.println(thirdSum);
        System.out.println(firstSum + (secondSum*10) + (thirdSum*100));
    }
}