import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;

        int index = 0;
        for(int i=1;i<10;i++){
            arr[i]=Integer.parseInt(br.readLine());

            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        System.out.print(max + "\n" + index);
    }
}
