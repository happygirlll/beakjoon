import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean b = true;

        for(int i=0;i<s.length();i++){
            if((s.charAt(i) != s.charAt(s.length()-i-1))){
                    b = false;
                    break;
            }
        }
        System.out.println(b ? 1 : 0);
    }
}
