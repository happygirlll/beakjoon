import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[26]; //영문자 개수는 26개

        int c = System.in.read();

        while (c > 64){ //공백을 입력 받으면 종료됨
            if(c<91){
                arr[c-65] ++; //해당 인덱스의 값 1 증가
            }
            else{ //소문자 범위
                arr[c-97] ++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2; //?는 63이다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = i;
            }
            else if (arr[i] == max){
                ch = -2;
            }
        }
        System.out.print((char)(ch+65)); // 대문자로 출력해야하므로 65을 더해줌.
    }
}
