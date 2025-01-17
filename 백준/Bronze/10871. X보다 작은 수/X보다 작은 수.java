import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String[] ArrayInput = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(ArrayInput[i]);
        }

        for(int j = 0; j < N; j++){
            if(A[j] < X){
                System.out.print(A[j]+" ");
            }
        }

    }
}
