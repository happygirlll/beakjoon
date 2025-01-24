import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[9][9];

        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;
        
        for(int i=0;i<9;i++){
            String[] input = br.readLine().split(" ");
            for(int j=0;j<9;j++){
                board[i][j]=Integer.parseInt(input[j]);

                if(board[i][j]>max){
                    max = board[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }

        }
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);

    }
}
