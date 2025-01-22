import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] croAlpa = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String alpaInput=br.readLine();

        // 크로아티아 알파벳 개수 계산
        int count = 0;
        for (String cro : croAlpa) {
            while (alpaInput.contains(cro)) {
                count++; // 크로아티아 알파벳 개수 증가
                alpaInput = alpaInput.replaceFirst(cro, " "); // 크로아티아 알파벳 제거
            }
        }

        // 남은 문자의 개수 추가
        alpaInput = alpaInput.replace(" ", ""); // 공백 제거
        count += alpaInput.length(); // 남은 단일 문자 개수 추가

        System.out.println(count);
    }
}
