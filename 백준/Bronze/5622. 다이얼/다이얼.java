import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ("ABC".indexOf(c) != -1) total += 3;
            else if ("DEF".indexOf(c) != -1) total += 4;
            else if ("GHI".indexOf(c) != -1) total += 5;
            else if ("JKL".indexOf(c) != -1) total += 6;
            else if ("MNO".indexOf(c) != -1) total += 7;
            else if ("PQRS".indexOf(c) != -1) total += 8;
            else if ("TUV".indexOf(c) != -1) total += 9;
            else if ("WXYZ".indexOf(c) != -1) total += 10;
        }

        System.out.println(total);
    }
}

