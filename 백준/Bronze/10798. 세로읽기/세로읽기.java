import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
            // 빈 부분은 공백으로
            for (int j = line.length(); j < 15; j++) {
                board[i][j] = ' ';
            }
        }

        StringBuilder result = new StringBuilder();
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (board[row][col] != ' ') {
                    result.append(board[row][col]);
                }
            }
        }

        System.out.println(result.toString());

    }
}
