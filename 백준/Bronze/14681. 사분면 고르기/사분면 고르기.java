import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a>0 && b>0){
            System.out.print(1);
        }
        else if(a>0 && b<0){
            System.out.print(4);
        }
        else if(a<0 && b>0){
            System.out.print(2);
        }
        else{
            System.out.print(3);
        }
    }
}
