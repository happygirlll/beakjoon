import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        int cook = Integer.parseInt(br.readLine());

       minute += cook;

       if(minute >= 60){
           hour += minute / 60;
           minute %= 60;
       }
       if(hour >= 24){
           hour %= 24;
       }
       System.out.println(hour + " " + minute);

    }
}