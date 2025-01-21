import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase(); // 모두 대문자로 변환
        
        HashMap<Character,Integer> freqMap=new HashMap<>();

        // 빈도 계산
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // 1. 최대 빈도 찾기
        int maxFreq = 0;
        for (int value : freqMap.values()) {
            if (value > maxFreq) {
                maxFreq = value;
            }
        }

        // 2. 최대 빈도에 해당하는 문자 확인
        char maxChar = '?';
        boolean bool = false;
        for (char key : freqMap.keySet()) {
            if (freqMap.get(key) == maxFreq) {
                if (maxChar == '?') { // 첫 번째 최대 빈도 문자
                    maxChar = key;
                } else { // 두 번째 최대 빈도 문자 발견
                    bool = true;
                    break;
                }
            }
        }

        // 결과 출력
        System.out.println(bool ? "?" : maxChar);
    }
}
