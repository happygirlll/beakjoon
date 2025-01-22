import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int count = 0; // 그룹 단어 개수 초기화

        for (int i = 1; i <= input; i++) {
            String str = br.readLine();
            if (isGroupWord(str)) {
                count++;
            }
        }

        System.out.println(count); // 최종 그룹 단어 개수 출력
    }

    public static boolean isGroupWord(String str) {
        int[] visited = new int[26]; // 알파벳 방문 여부를 0으로 초기화
        char prev = ' '; // 이전 문자 초기화

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // 현재 문자
            int idx = curr - 'a'; // 알파벳 인덱스 계산

            if (curr != prev) { // 이전 문자와 다를 경우
                if (visited[idx] > 0) { // 이미 방문한 알파벳이라면 그룹 단어 아님
                    return false; // 그룹 단어가 아님
                }
                visited[idx] = 1; // 현재 문자 방문 처리
            }
            prev = curr; // 이전 문자를 현재 문자로 업데이트
        }

        return true; // 그룹 단어일 경우
    }
}
