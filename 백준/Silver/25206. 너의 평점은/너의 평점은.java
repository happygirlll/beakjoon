import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        double total=0.0;
        double sum=0.0;

        String[] gradeScale = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeValues = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            String[] data = line.split(" ");

            double credit = Double.parseDouble(data[1]); //학점
            String grade = data[2]; //등급

            if (!grade.equals("P")) { // Pass 과목은 포함안함
                for (int j = 0; j < gradeScale.length; j++) {
                    if (grade.equals(gradeScale[j])) {
                        total += credit; // 총 학점
                        sum += credit * gradeValues[j]; // (학점 * 등급 점수)
                        break;
                    }
                }
            }
        }
        
        double gpa = total == 0 ? 0.0 : sum / total;
        System.out.printf("%.6f", gpa);

    }
}
